package androidx.media3.exoplayer.rtsp;

import O1.AbstractC0498a;
import O1.AbstractC0529x;
import O1.I0;
import O1.L;
import O1.P;
import O1.S;
import O1.U;
import O1.t0;
import O1.w0;
import O1.y0;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import androidx.media3.exoplayer.rtsp.RtspMediaPeriod;
import androidx.media3.exoplayer.rtsp.RtspMediaSource;
import androidx.media3.exoplayer.rtsp.RtspMessageChannel;
import androidx.media3.exoplayer.rtsp.RtspMessageUtil;
import com.dynatrace.android.agent.Global;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes2.dex */
final class RtspClient implements Closeable, AutoCloseable {
    private static final int DEFAULT_RTSP_KEEP_ALIVE_INTERVAL_DIVISOR = 2;
    public static final int RTSP_STATE_INIT = 0;
    public static final int RTSP_STATE_PLAYING = 2;
    public static final int RTSP_STATE_READY = 1;
    public static final int RTSP_STATE_UNINITIALIZED = -1;
    private static final String TAG = "RtspClient";
    private final boolean debugLoggingEnabled;
    private boolean hasPendingPauseRequest;
    private boolean hasUpdatedTimelineAndTracks;

    @Nullable
    private KeepAliveMonitor keepAliveMonitor;
    private final PlaybackEventListener playbackEventListener;
    private boolean receivedAuthorizationRequest;

    @Nullable
    private RtspMessageUtil.RtspAuthUserInfo rtspAuthUserInfo;

    @Nullable
    private RtspAuthenticationInfo rtspAuthenticationInfo;

    @Nullable
    private String sessionId;
    private final SessionInfoListener sessionInfoListener;
    private final SocketFactory socketFactory;
    private Uri uri;
    private final String userAgent;
    private final ArrayDeque<RtspMediaPeriod.RtpLoadInfo> pendingSetupRtpLoadInfos = new ArrayDeque<>();
    private final SparseArray<RtspRequest> pendingRequests = new SparseArray<>();
    private final MessageSender messageSender = new MessageSender();
    private RtspMessageChannel messageChannel = new RtspMessageChannel(new MessageListener());
    private long sessionTimeoutMs = 60000;
    private long pendingSeekPositionUs = C.TIME_UNSET;
    private int rtspState = -1;

    public final class KeepAliveMonitor implements Runnable, Closeable, AutoCloseable {
        private final long intervalMs;
        private boolean isStarted;
        private final Handler keepAliveHandler = Util.createHandlerForCurrentLooper();

        public KeepAliveMonitor(long j) {
            this.intervalMs = j;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.isStarted = false;
            this.keepAliveHandler.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            RtspClient.this.messageSender.sendOptionsRequest(RtspClient.this.uri, RtspClient.this.sessionId);
            this.keepAliveHandler.postDelayed(this, this.intervalMs);
        }

        public void start() {
            if (this.isStarted) {
                return;
            }
            this.isStarted = true;
            this.keepAliveHandler.postDelayed(this, this.intervalMs);
        }
    }

    public final class MessageListener implements RtspMessageChannel.MessageListener {
        private final Handler messageHandler = Util.createHandlerForCurrentLooper();

        public MessageListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: handleRtspMessage, reason: merged with bridge method [inline-methods] */
        public void lambda$onRtspMessageReceived$0(List<String> list) {
            RtspClient.this.maybeLogMessage(list);
            if (RtspMessageUtil.isRtspResponse(list)) {
                handleRtspResponse(list);
            } else {
                handleRtspRequest(list);
            }
        }

        private void handleRtspRequest(List<String> list) {
            RtspClient.this.messageSender.sendMethodNotAllowedResponse(Integer.parseInt((String) Assertions.checkNotNull(RtspMessageUtil.parseRequest(list).headers.get(RtspHeaders.CSEQ))));
        }

        private void handleRtspResponse(List<String> list) {
            List trackTiming;
            RtspResponse response = RtspMessageUtil.parseResponse(list);
            int i = Integer.parseInt((String) Assertions.checkNotNull(response.headers.get(RtspHeaders.CSEQ)));
            RtspRequest rtspRequest = (RtspRequest) RtspClient.this.pendingRequests.get(i);
            if (rtspRequest == null) {
                return;
            }
            RtspClient.this.pendingRequests.remove(i);
            int i4 = rtspRequest.method;
            try {
                try {
                    int i6 = response.status;
                    if (i6 == 200) {
                        switch (i4) {
                            case 1:
                            case 3:
                            case 7:
                            case 8:
                            case 9:
                            case 11:
                            case 12:
                                return;
                            case 2:
                                onDescribeResponseReceived(new RtspDescribeResponse(response.headers, i6, SessionDescriptionParser.parse(response.messageBody)));
                                return;
                            case 4:
                                onOptionsResponseReceived(new RtspOptionsResponse(i6, RtspMessageUtil.parsePublicHeader(response.headers.get(RtspHeaders.PUBLIC))));
                                return;
                            case 5:
                                onPauseResponseReceived();
                                return;
                            case 6:
                                String str = response.headers.get(RtspHeaders.RANGE);
                                RtspSessionTiming timing = str == null ? RtspSessionTiming.DEFAULT : RtspSessionTiming.parseTiming(str);
                                try {
                                    String str2 = response.headers.get(RtspHeaders.RTP_INFO);
                                    if (str2 == null) {
                                        P p10 = S.f4555b;
                                        trackTiming = t0.e;
                                    } else {
                                        trackTiming = RtspTrackTiming.parseTrackTiming(str2, RtspClient.this.uri);
                                    }
                                } catch (ParserException unused) {
                                    P p11 = S.f4555b;
                                    trackTiming = t0.e;
                                }
                                onPlayResponseReceived(new RtspPlayResponse(response.status, timing, trackTiming));
                                return;
                            case 10:
                                String str3 = response.headers.get(RtspHeaders.SESSION);
                                String str4 = response.headers.get(RtspHeaders.TRANSPORT);
                                if (str3 == null || str4 == null) {
                                    throw ParserException.createForMalformedManifest("Missing mandatory session or transport header", null);
                                }
                                onSetupResponseReceived(new RtspSetupResponse(response.status, RtspMessageUtil.parseSessionHeader(str3), str4));
                                return;
                            default:
                                throw new IllegalStateException();
                        }
                    }
                    if (i6 == 401) {
                        if (RtspClient.this.rtspAuthUserInfo == null || RtspClient.this.receivedAuthorizationRequest) {
                            RtspClient.this.dispatchRtspError(new RtspMediaSource.RtspPlaybackException(RtspMessageUtil.toMethodString(i4) + Global.BLANK + response.status));
                            return;
                        }
                        S sValues = response.headers.values(RtspHeaders.WWW_AUTHENTICATE);
                        if (sValues.isEmpty()) {
                            throw ParserException.createForMalformedManifest("Missing WWW-Authenticate header in a 401 response.", null);
                        }
                        for (int i10 = 0; i10 < sValues.size(); i10++) {
                            RtspClient.this.rtspAuthenticationInfo = RtspMessageUtil.parseWwwAuthenticateHeader((String) sValues.get(i10));
                            if (RtspClient.this.rtspAuthenticationInfo.authenticationMechanism == 2) {
                                break;
                            }
                        }
                        RtspClient.this.messageSender.retryLastRequest();
                        RtspClient.this.receivedAuthorizationRequest = true;
                        return;
                    }
                    if (i6 == 461) {
                        String str5 = RtspMessageUtil.toMethodString(i4) + Global.BLANK + response.status;
                        RtspClient.this.dispatchRtspError((i4 != 10 || ((String) Assertions.checkNotNull(rtspRequest.headers.get(RtspHeaders.TRANSPORT))).contains("TCP")) ? new RtspMediaSource.RtspPlaybackException(str5) : new RtspMediaSource.RtspUdpUnsupportedTransportException(str5));
                        return;
                    }
                    if (i6 != 301 && i6 != 302) {
                        RtspClient.this.dispatchRtspError(new RtspMediaSource.RtspPlaybackException(RtspMessageUtil.toMethodString(i4) + Global.BLANK + response.status));
                        return;
                    }
                    if (RtspClient.this.rtspState != -1) {
                        RtspClient.this.rtspState = 0;
                    }
                    String str6 = response.headers.get(RtspHeaders.LOCATION);
                    if (str6 == null) {
                        RtspClient.this.sessionInfoListener.onSessionTimelineRequestFailed("Redirection without new location.", null);
                        return;
                    }
                    Uri uri = Uri.parse(str6);
                    RtspClient.this.uri = RtspMessageUtil.removeUserInfo(uri);
                    RtspClient.this.rtspAuthUserInfo = RtspMessageUtil.parseUserInfo(uri);
                    RtspClient.this.messageSender.sendDescribeRequest(RtspClient.this.uri, RtspClient.this.sessionId);
                } catch (IllegalArgumentException e) {
                    e = e;
                    RtspClient.this.dispatchRtspError(new RtspMediaSource.RtspPlaybackException(e));
                }
            } catch (ParserException e7) {
                e = e7;
                RtspClient.this.dispatchRtspError(new RtspMediaSource.RtspPlaybackException(e));
            }
        }

        private void onDescribeResponseReceived(RtspDescribeResponse rtspDescribeResponse) {
            RtspSessionTiming timing = RtspSessionTiming.DEFAULT;
            String str = (String) rtspDescribeResponse.sessionDescription.attributes.get(SessionDescription.ATTR_RANGE);
            if (str != null) {
                try {
                    timing = RtspSessionTiming.parseTiming(str);
                } catch (ParserException e) {
                    RtspClient.this.sessionInfoListener.onSessionTimelineRequestFailed("SDP format error.", e);
                    return;
                }
            }
            S sBuildTrackList = RtspClient.buildTrackList(rtspDescribeResponse, RtspClient.this.uri);
            if (sBuildTrackList.isEmpty()) {
                RtspClient.this.sessionInfoListener.onSessionTimelineRequestFailed("No playable track.", null);
            } else {
                RtspClient.this.sessionInfoListener.onSessionTimelineUpdated(timing, sBuildTrackList);
                RtspClient.this.hasUpdatedTimelineAndTracks = true;
            }
        }

        private void onOptionsResponseReceived(RtspOptionsResponse rtspOptionsResponse) {
            if (RtspClient.this.keepAliveMonitor != null) {
                return;
            }
            if (RtspClient.serverSupportsDescribe(rtspOptionsResponse.supportedMethods)) {
                RtspClient.this.messageSender.sendDescribeRequest(RtspClient.this.uri, RtspClient.this.sessionId);
            } else {
                RtspClient.this.sessionInfoListener.onSessionTimelineRequestFailed("DESCRIBE not supported.", null);
            }
        }

        private void onPauseResponseReceived() {
            Assertions.checkState(RtspClient.this.rtspState == 2);
            RtspClient.this.rtspState = 1;
            RtspClient.this.hasPendingPauseRequest = false;
            if (RtspClient.this.pendingSeekPositionUs != C.TIME_UNSET) {
                RtspClient rtspClient = RtspClient.this;
                rtspClient.startPlayback(Util.usToMs(rtspClient.pendingSeekPositionUs));
            }
        }

        private void onPlayResponseReceived(RtspPlayResponse rtspPlayResponse) {
            boolean z4 = true;
            if (RtspClient.this.rtspState != 1 && RtspClient.this.rtspState != 2) {
                z4 = false;
            }
            Assertions.checkState(z4);
            RtspClient.this.rtspState = 2;
            if (RtspClient.this.keepAliveMonitor == null) {
                RtspClient rtspClient = RtspClient.this;
                rtspClient.keepAliveMonitor = rtspClient.new KeepAliveMonitor(rtspClient.sessionTimeoutMs / 2);
                RtspClient.this.keepAliveMonitor.start();
            }
            RtspClient.this.pendingSeekPositionUs = C.TIME_UNSET;
            RtspClient.this.playbackEventListener.onPlaybackStarted(Util.msToUs(rtspPlayResponse.sessionTiming.startTimeMs), rtspPlayResponse.trackTimingList);
        }

        private void onSetupResponseReceived(RtspSetupResponse rtspSetupResponse) {
            Assertions.checkState(RtspClient.this.rtspState != -1);
            RtspClient.this.rtspState = 1;
            RtspClient.this.sessionId = rtspSetupResponse.sessionHeader.sessionId;
            RtspClient.this.sessionTimeoutMs = rtspSetupResponse.sessionHeader.timeoutMs;
            RtspClient.this.continueSetupRtspTrack();
        }

        @Override // androidx.media3.exoplayer.rtsp.RtspMessageChannel.MessageListener
        public final /* synthetic */ void onReceivingFailed(Exception exc) {
            h.a(this, exc);
        }

        @Override // androidx.media3.exoplayer.rtsp.RtspMessageChannel.MessageListener
        public void onRtspMessageReceived(final List<String> list) {
            this.messageHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.rtsp.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8065a.lambda$onRtspMessageReceived$0(list);
                }
            });
        }

        @Override // androidx.media3.exoplayer.rtsp.RtspMessageChannel.MessageListener
        public final /* synthetic */ void onSendingFailed(List list, Exception exc) {
            h.b(this, list, exc);
        }
    }

    public final class MessageSender {
        private int cSeq;
        private RtspRequest lastRequest;

        private MessageSender() {
        }

        private RtspRequest getRequestWithCommonHeaders(int i, @Nullable String str, Map<String, String> map, Uri uri) {
            String str2 = RtspClient.this.userAgent;
            int i4 = this.cSeq;
            this.cSeq = i4 + 1;
            RtspHeaders.Builder builder = new RtspHeaders.Builder(str2, str, i4);
            if (RtspClient.this.rtspAuthenticationInfo != null) {
                Assertions.checkStateNotNull(RtspClient.this.rtspAuthUserInfo);
                try {
                    builder.add(RtspHeaders.AUTHORIZATION, RtspClient.this.rtspAuthenticationInfo.getAuthorizationHeaderValue(RtspClient.this.rtspAuthUserInfo, uri, i));
                } catch (ParserException e) {
                    RtspClient.this.dispatchRtspError(new RtspMediaSource.RtspPlaybackException(e));
                }
            }
            builder.addAll(map);
            return new RtspRequest(uri, i, builder.build(), "");
        }

        private void sendRequest(RtspRequest rtspRequest) {
            int i = Integer.parseInt((String) Assertions.checkNotNull(rtspRequest.headers.get(RtspHeaders.CSEQ)));
            Assertions.checkState(RtspClient.this.pendingRequests.get(i) == null);
            RtspClient.this.pendingRequests.append(i, rtspRequest);
            S sSerializeRequest = RtspMessageUtil.serializeRequest(rtspRequest);
            RtspClient.this.maybeLogMessage(sSerializeRequest);
            RtspClient.this.messageChannel.send(sSerializeRequest);
            this.lastRequest = rtspRequest;
        }

        private void sendResponse(RtspResponse rtspResponse) {
            S sSerializeResponse = RtspMessageUtil.serializeResponse(rtspResponse);
            RtspClient.this.maybeLogMessage(sSerializeResponse);
            RtspClient.this.messageChannel.send(sSerializeResponse);
        }

        public void retryLastRequest() {
            Assertions.checkStateNotNull(this.lastRequest);
            U uAsMultiMap = this.lastRequest.headers.asMultiMap();
            HashMap map = new HashMap();
            I0 it = ((w0) uAsMultiMap.e.keySet()).iterator();
            while (true) {
                AbstractC0498a abstractC0498a = (AbstractC0498a) it;
                if (!abstractC0498a.hasNext()) {
                    sendRequest(getRequestWithCommonHeaders(this.lastRequest.method, RtspClient.this.sessionId, map, this.lastRequest.uri));
                    return;
                }
                String str = (String) abstractC0498a.next();
                if (!str.equals(RtspHeaders.CSEQ) && !str.equals(RtspHeaders.USER_AGENT) && !str.equals(RtspHeaders.SESSION) && !str.equals(RtspHeaders.AUTHORIZATION)) {
                    map.put(str, (String) AbstractC0529x.k(uAsMultiMap.get(str)));
                }
            }
        }

        public void sendDescribeRequest(Uri uri, @Nullable String str) {
            sendRequest(getRequestWithCommonHeaders(2, str, y0.f4618g, uri));
        }

        public void sendMethodNotAllowedResponse(int i) {
            sendResponse(new RtspResponse(405, new RtspHeaders.Builder(RtspClient.this.userAgent, RtspClient.this.sessionId, i).build()));
            this.cSeq = Math.max(this.cSeq, i + 1);
        }

        public void sendOptionsRequest(Uri uri, @Nullable String str) {
            sendRequest(getRequestWithCommonHeaders(4, str, y0.f4618g, uri));
        }

        public void sendPauseRequest(Uri uri, String str) {
            Assertions.checkState(RtspClient.this.rtspState == 2);
            sendRequest(getRequestWithCommonHeaders(5, str, y0.f4618g, uri));
            RtspClient.this.hasPendingPauseRequest = true;
        }

        public void sendPlayRequest(Uri uri, long j, String str) {
            Assertions.checkState(RtspClient.this.rtspState == 1 || RtspClient.this.rtspState == 2);
            String offsetStartTimeTiming = RtspSessionTiming.getOffsetStartTimeTiming(j);
            AbstractC0529x.c(RtspHeaders.RANGE, offsetStartTimeTiming);
            sendRequest(getRequestWithCommonHeaders(6, str, y0.e(1, new Object[]{RtspHeaders.RANGE, offsetStartTimeTiming}, null), uri));
        }

        public void sendSetupRequest(Uri uri, String str, @Nullable String str2) {
            RtspClient.this.rtspState = 0;
            AbstractC0529x.c(RtspHeaders.TRANSPORT, str);
            sendRequest(getRequestWithCommonHeaders(10, str2, y0.e(1, new Object[]{RtspHeaders.TRANSPORT, str}, null), uri));
        }

        public void sendTeardownRequest(Uri uri, String str) {
            if (RtspClient.this.rtspState == -1 || RtspClient.this.rtspState == 0) {
                return;
            }
            RtspClient.this.rtspState = 0;
            sendRequest(getRequestWithCommonHeaders(12, str, y0.f4618g, uri));
        }
    }

    public interface PlaybackEventListener {
        void onPlaybackError(RtspMediaSource.RtspPlaybackException rtspPlaybackException);

        void onPlaybackStarted(long j, S s9);

        void onRtspSetupCompleted();
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RtspState {
    }

    public interface SessionInfoListener {
        void onSessionTimelineRequestFailed(String str, @Nullable Throwable th2);

        void onSessionTimelineUpdated(RtspSessionTiming rtspSessionTiming, S s9);
    }

    public RtspClient(SessionInfoListener sessionInfoListener, PlaybackEventListener playbackEventListener, String str, Uri uri, SocketFactory socketFactory, boolean z4) {
        this.sessionInfoListener = sessionInfoListener;
        this.playbackEventListener = playbackEventListener;
        this.userAgent = str;
        this.socketFactory = socketFactory;
        this.debugLoggingEnabled = z4;
        this.uri = RtspMessageUtil.removeUserInfo(uri);
        this.rtspAuthUserInfo = RtspMessageUtil.parseUserInfo(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static S buildTrackList(RtspDescribeResponse rtspDescribeResponse, Uri uri) {
        AbstractC0529x.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        for (int i4 = 0; i4 < rtspDescribeResponse.sessionDescription.mediaDescriptionList.size(); i4++) {
            MediaDescription mediaDescription = (MediaDescription) rtspDescribeResponse.sessionDescription.mediaDescriptionList.get(i4);
            if (RtpPayloadFormat.isFormatSupported(mediaDescription)) {
                RtspMediaTrack rtspMediaTrack = new RtspMediaTrack(rtspDescribeResponse.headers, mediaDescription, uri);
                int i6 = i + 1;
                if (objArrCopyOf.length < i6) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, L.e(objArrCopyOf.length, i6));
                }
                objArrCopyOf[i] = rtspMediaTrack;
                i = i6;
            }
        }
        return S.i(i, objArrCopyOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void continueSetupRtspTrack() {
        RtspMediaPeriod.RtpLoadInfo rtpLoadInfoPollFirst = this.pendingSetupRtpLoadInfos.pollFirst();
        if (rtpLoadInfoPollFirst == null) {
            this.playbackEventListener.onRtspSetupCompleted();
        } else {
            this.messageSender.sendSetupRequest(rtpLoadInfoPollFirst.getTrackUri(), rtpLoadInfoPollFirst.getTransport(), this.sessionId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchRtspError(Throwable th2) {
        RtspMediaSource.RtspPlaybackException rtspPlaybackException = th2 instanceof RtspMediaSource.RtspPlaybackException ? (RtspMediaSource.RtspPlaybackException) th2 : new RtspMediaSource.RtspPlaybackException(th2);
        if (this.hasUpdatedTimelineAndTracks) {
            this.playbackEventListener.onPlaybackError(rtspPlaybackException);
            return;
        }
        SessionInfoListener sessionInfoListener = this.sessionInfoListener;
        String message = th2.getMessage();
        if (message == null) {
            message = "";
        }
        sessionInfoListener.onSessionTimelineRequestFailed(message, th2);
    }

    private Socket getSocket(Uri uri) throws IOException {
        Assertions.checkArgument(uri.getHost() != null);
        return this.socketFactory.createSocket((String) Assertions.checkNotNull(uri.getHost()), uri.getPort() > 0 ? uri.getPort() : RtspMessageChannel.DEFAULT_RTSP_PORT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeLogMessage(List<String> list) {
        if (this.debugLoggingEnabled) {
            Log.d(TAG, new N1.h(Global.NEWLINE).b(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean serverSupportsDescribe(List<Integer> list) {
        return list.isEmpty() || list.contains(2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        KeepAliveMonitor keepAliveMonitor = this.keepAliveMonitor;
        if (keepAliveMonitor != null) {
            keepAliveMonitor.close();
            this.keepAliveMonitor = null;
            this.messageSender.sendTeardownRequest(this.uri, (String) Assertions.checkNotNull(this.sessionId));
        }
        this.messageChannel.close();
    }

    public int getState() {
        return this.rtspState;
    }

    public void registerInterleavedDataChannel(int i, RtspMessageChannel.InterleavedBinaryDataListener interleavedBinaryDataListener) {
        this.messageChannel.registerInterleavedBinaryDataListener(i, interleavedBinaryDataListener);
    }

    public void retryWithRtpTcp() {
        try {
            close();
            RtspMessageChannel rtspMessageChannel = new RtspMessageChannel(new MessageListener());
            this.messageChannel = rtspMessageChannel;
            rtspMessageChannel.open(getSocket(this.uri));
            this.sessionId = null;
            this.receivedAuthorizationRequest = false;
            this.rtspAuthenticationInfo = null;
        } catch (IOException e) {
            this.playbackEventListener.onPlaybackError(new RtspMediaSource.RtspPlaybackException(e));
        }
    }

    public void seekToUs(long j) {
        if (this.rtspState == 2 && !this.hasPendingPauseRequest) {
            this.messageSender.sendPauseRequest(this.uri, (String) Assertions.checkNotNull(this.sessionId));
        }
        this.pendingSeekPositionUs = j;
    }

    public void setupSelectedTracks(List<RtspMediaPeriod.RtpLoadInfo> list) {
        this.pendingSetupRtpLoadInfos.addAll(list);
        continueSetupRtspTrack();
    }

    public void signalPlaybackEnded() {
        this.rtspState = 1;
    }

    public void start() throws IOException {
        try {
            this.messageChannel.open(getSocket(this.uri));
            this.messageSender.sendOptionsRequest(this.uri, this.sessionId);
        } catch (IOException e) {
            Util.closeQuietly(this.messageChannel);
            throw e;
        }
    }

    public void startPlayback(long j) {
        this.messageSender.sendPlayRequest(this.uri, j, (String) Assertions.checkNotNull(this.sessionId));
    }
}
