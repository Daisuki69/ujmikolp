package io.flutter.embedding.engine.systemchannels;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.video.AudioStats;
import androidx.media3.extractor.text.ttml.TtmlNode;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import pg.E;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: loaded from: classes4.dex */
public class PlatformViewsChannel {
    private static final String TAG = "PlatformViewsChannel";
    private final u channel;
    private PlatformViewsHandler handler;
    private final s parsingHandler;

    /* JADX INFO: renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$1, reason: invalid class name */
    public class AnonymousClass1 implements s {
        public AnonymousClass1() {
        }

        private void clearFocus(@NonNull r rVar, @NonNull t tVar) {
            try {
                PlatformViewsChannel.this.handler.clearFocus(((Integer) rVar.f19113b).intValue());
                tVar.success(null);
            } catch (IllegalStateException e) {
                tVar.error(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, PlatformViewsChannel.detailedExceptionString(e), null);
            }
        }

        private void create(@NonNull r rVar, @NonNull t tVar) {
            Map map = (Map) rVar.f19113b;
            boolean z4 = false;
            boolean z5 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer byteBufferWrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
            try {
                if (z5) {
                    PlatformViewsChannel.this.handler.createForPlatformViewLayer(new PlatformViewCreationRequest(((Integer) map.get(TtmlNode.ATTR_ID)).intValue(), (String) map.get("viewType"), AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, ((Integer) map.get("direction")).intValue(), PlatformViewCreationRequest.RequestedDisplayMode.HYBRID_ONLY, byteBufferWrap));
                    tVar.success(null);
                    return;
                }
                if (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) {
                    z4 = true;
                }
                PlatformViewCreationRequest.RequestedDisplayMode requestedDisplayMode = z4 ? PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_HYBRID_FALLBACK : PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_VIRTUAL_FALLBACK;
                int iIntValue = ((Integer) map.get(TtmlNode.ATTR_ID)).intValue();
                String str = (String) map.get("viewType");
                boolean zContainsKey = map.containsKey("top");
                double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
                double dDoubleValue2 = zContainsKey ? ((Double) map.get("top")).doubleValue() : 0.0d;
                if (map.containsKey(TtmlNode.LEFT)) {
                    dDoubleValue = ((Double) map.get(TtmlNode.LEFT)).doubleValue();
                }
                long jCreateForTextureLayer = PlatformViewsChannel.this.handler.createForTextureLayer(new PlatformViewCreationRequest(iIntValue, str, dDoubleValue2, dDoubleValue, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), requestedDisplayMode, byteBufferWrap));
                if (jCreateForTextureLayer != -2) {
                    tVar.success(Long.valueOf(jCreateForTextureLayer));
                } else {
                    if (!z4) {
                        throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                    }
                    tVar.success(null);
                }
            } catch (IllegalStateException e) {
                tVar.error(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, PlatformViewsChannel.detailedExceptionString(e), null);
            }
        }

        private void dispose(@NonNull r rVar, @NonNull t tVar) {
            try {
                PlatformViewsChannel.this.handler.dispose(((Integer) ((Map) rVar.f19113b).get(TtmlNode.ATTR_ID)).intValue());
                tVar.success(null);
            } catch (IllegalStateException e) {
                tVar.error(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, PlatformViewsChannel.detailedExceptionString(e), null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$resize$0(t tVar, PlatformViewBufferSize platformViewBufferSize) {
            if (platformViewBufferSize == null) {
                tVar.error(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, "Failed to resize the platform view", null);
                return;
            }
            HashMap map = new HashMap();
            map.put("width", Double.valueOf(platformViewBufferSize.width));
            map.put("height", Double.valueOf(platformViewBufferSize.height));
            tVar.success(map);
        }

        private void offset(@NonNull r rVar, @NonNull t tVar) {
            Map map = (Map) rVar.f19113b;
            try {
                PlatformViewsChannel.this.handler.offset(((Integer) map.get(TtmlNode.ATTR_ID)).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get(TtmlNode.LEFT)).doubleValue());
                tVar.success(null);
            } catch (IllegalStateException e) {
                tVar.error(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, PlatformViewsChannel.detailedExceptionString(e), null);
            }
        }

        private void resize(@NonNull r rVar, @NonNull t tVar) {
            Map map = (Map) rVar.f19113b;
            try {
                PlatformViewsChannel.this.handler.resize(new PlatformViewResizeRequest(((Integer) map.get(TtmlNode.ATTR_ID)).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new b(tVar));
            } catch (IllegalStateException e) {
                tVar.error(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, PlatformViewsChannel.detailedExceptionString(e), null);
            }
        }

        private void setDirection(@NonNull r rVar, @NonNull t tVar) {
            Map map = (Map) rVar.f19113b;
            try {
                PlatformViewsChannel.this.handler.setDirection(((Integer) map.get(TtmlNode.ATTR_ID)).intValue(), ((Integer) map.get("direction")).intValue());
                tVar.success(null);
            } catch (IllegalStateException e) {
                tVar.error(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, PlatformViewsChannel.detailedExceptionString(e), null);
            }
        }

        private void synchronizeToNativeViewHierarchy(@NonNull r rVar, @NonNull t tVar) {
            try {
                PlatformViewsChannel.this.handler.synchronizeToNativeViewHierarchy(((Boolean) rVar.f19113b).booleanValue());
                tVar.success(null);
            } catch (IllegalStateException e) {
                tVar.error(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, PlatformViewsChannel.detailedExceptionString(e), null);
            }
        }

        private void touch(@NonNull r rVar, @NonNull t tVar) {
            List list = (List) rVar.f19113b;
            try {
                PlatformViewsChannel.this.handler.onTouch(new PlatformViewTouch(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                tVar.success(null);
            } catch (IllegalStateException e) {
                tVar.error(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, PlatformViewsChannel.detailedExceptionString(e), null);
            }
        }

        @Override // pg.s
        public void onMethodCall(@NonNull r rVar, @NonNull t tVar) {
            if (PlatformViewsChannel.this.handler == null) {
            }
            String str = rVar.f19112a;
            str.getClass();
            switch (str) {
                case "create":
                    create(rVar, tVar);
                    break;
                case "offset":
                    offset(rVar, tVar);
                    break;
                case "resize":
                    resize(rVar, tVar);
                    break;
                case "clearFocus":
                    clearFocus(rVar, tVar);
                    break;
                case "synchronizeToNativeViewHierarchy":
                    synchronizeToNativeViewHierarchy(rVar, tVar);
                    break;
                case "touch":
                    touch(rVar, tVar);
                    break;
                case "setDirection":
                    setDirection(rVar, tVar);
                    break;
                case "dispose":
                    dispose(rVar, tVar);
                    break;
                default:
                    tVar.notImplemented();
                    break;
            }
        }
    }

    public interface PlatformViewBufferResized {
        void run(@Nullable PlatformViewBufferSize platformViewBufferSize);
    }

    public static class PlatformViewBufferSize {
        public final int height;
        public final int width;

        public PlatformViewBufferSize(int i, int i4) {
            this.width = i;
            this.height = i4;
        }
    }

    public static class PlatformViewCreationRequest {
        public final int direction;
        public final RequestedDisplayMode displayMode;
        public final double logicalHeight;
        public final double logicalLeft;
        public final double logicalTop;
        public final double logicalWidth;

        @Nullable
        public final ByteBuffer params;
        public final int viewId;

        @NonNull
        public final String viewType;

        public enum RequestedDisplayMode {
            TEXTURE_WITH_VIRTUAL_FALLBACK,
            TEXTURE_WITH_HYBRID_FALLBACK,
            HYBRID_ONLY
        }

        public PlatformViewCreationRequest(int i, @NonNull String str, double d10, double d11, double d12, double d13, int i4, @Nullable ByteBuffer byteBuffer) {
            this(i, str, d10, d11, d12, d13, i4, RequestedDisplayMode.TEXTURE_WITH_VIRTUAL_FALLBACK, byteBuffer);
        }

        public PlatformViewCreationRequest(int i, @NonNull String str, double d10, double d11, double d12, double d13, int i4, RequestedDisplayMode requestedDisplayMode, @Nullable ByteBuffer byteBuffer) {
            this.viewId = i;
            this.viewType = str;
            this.logicalTop = d10;
            this.logicalLeft = d11;
            this.logicalWidth = d12;
            this.logicalHeight = d13;
            this.direction = i4;
            this.displayMode = requestedDisplayMode;
            this.params = byteBuffer;
        }
    }

    public static class PlatformViewResizeRequest {
        public final double newLogicalHeight;
        public final double newLogicalWidth;
        public final int viewId;

        public PlatformViewResizeRequest(int i, double d10, double d11) {
            this.viewId = i;
            this.newLogicalWidth = d10;
            this.newLogicalHeight = d11;
        }
    }

    public static class PlatformViewTouch {
        public final int action;
        public final int buttonState;
        public final int deviceId;

        @NonNull
        public final Number downTime;
        public final int edgeFlags;

        @NonNull
        public final Number eventTime;
        public final int flags;
        public final int metaState;
        public final long motionEventId;
        public final int pointerCount;

        @NonNull
        public final Object rawPointerCoords;

        @NonNull
        public final Object rawPointerPropertiesList;
        public final int source;
        public final int viewId;
        public final float xPrecision;
        public final float yPrecision;

        public PlatformViewTouch(int i, @NonNull Number number, @NonNull Number number2, int i4, int i6, @NonNull Object obj, @NonNull Object obj2, int i10, int i11, float f, float f3, int i12, int i13, int i14, int i15, long j) {
            this.viewId = i;
            this.downTime = number;
            this.eventTime = number2;
            this.action = i4;
            this.pointerCount = i6;
            this.rawPointerPropertiesList = obj;
            this.rawPointerCoords = obj2;
            this.metaState = i10;
            this.buttonState = i11;
            this.xPrecision = f;
            this.yPrecision = f3;
            this.deviceId = i12;
            this.edgeFlags = i13;
            this.source = i14;
            this.flags = i15;
            this.motionEventId = j;
        }
    }

    public interface PlatformViewsHandler {
        public static final long NON_TEXTURE_FALLBACK = -2;

        void clearFocus(int i);

        void createForPlatformViewLayer(@NonNull PlatformViewCreationRequest platformViewCreationRequest);

        long createForTextureLayer(@NonNull PlatformViewCreationRequest platformViewCreationRequest);

        void dispose(int i);

        void offset(int i, double d10, double d11);

        void onTouch(@NonNull PlatformViewTouch platformViewTouch);

        void resize(@NonNull PlatformViewResizeRequest platformViewResizeRequest, @NonNull PlatformViewBufferResized platformViewBufferResized);

        void setDirection(int i, int i4);

        void synchronizeToNativeViewHierarchy(boolean z4);
    }

    public PlatformViewsChannel(@NonNull DartExecutor dartExecutor) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        this.parsingHandler = anonymousClass1;
        u uVar = new u(dartExecutor, "flutter/platform_views", E.f19095b, null);
        this.channel = uVar;
        uVar.b(anonymousClass1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String detailedExceptionString(Exception exc) {
        return Log.getStackTraceString(exc);
    }

    public void invokeViewFocused(int i) {
        u uVar = this.channel;
        if (uVar == null) {
            return;
        }
        uVar.a("viewFocused", Integer.valueOf(i), null);
    }

    public void setPlatformViewsHandler(@Nullable PlatformViewsHandler platformViewsHandler) {
        this.handler = platformViewsHandler;
    }
}
