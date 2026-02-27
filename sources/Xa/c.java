package Xa;

import Ch.f;
import D.d0;
import D8.C0214w;
import G5.t;
import L9.C0327e;
import N1.g;
import O1.O;
import Xb.h;
import Y6.k;
import Z.p;
import a1.C0621b;
import a1.C0622c;
import a7.InterfaceC0642c;
import a7.RunnableC0640a;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.LiveDataObservable;
import androidx.camera.extensions.ExtensionsManager;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import androidx.media3.common.FlagSet;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.RandomTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelectionUtil;
import androidx.media3.extractor.BinarySearchSeeker;
import androidx.media3.extractor.FlacStreamMetadata;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Track;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleExtractor;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.navigation.NavController;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.RecyclerView;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewStartUpResult;
import b1.n;
import b1.w;
import bc.d;
import cj.C1112C;
import cj.C1129o;
import cj.r;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.encoders.EncodingException;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.MayaResizingTabLayout;
import com.paymaya.data.database.repository.C;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopProviderSubcategory;
import com.paymaya.domain.store.C1258f0;
import com.paymaya.domain.store.P0;
import com.paymaya.mayaui.common.view.activity.impl.MayaUpdaterActivity;
import com.paymaya.mayaui.common.view.fragment.impl.MayaAllowContactsPermissionFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaUpdaterFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaWebFragment;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPageFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderPageFragment;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;
import db.InterfaceC1349b;
import dc.i;
import g9.InterfaceC1507b;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import k2.v0;
import kotlin.jvm.internal.j;
import o1.AbstractC1955a;
import o6.C1967a;
import v5.C2342a;
import w2.C2373d;
import w2.C2374e;
import y5.s;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Ch.a, ActivityResultCallback, t, f, l0.f, Rc.b, CallbackToFutureAdapter.Resolver, InputConnectionCompat.OnCommitContentListener, ListenerSet.Event, ListenerSet.IterationFinishedEvent, DefaultTrackSelector.TrackInfo.Factory, TrackSelectionUtil.AdaptiveTrackSelectionFactory, BinarySearchSeeker.SeekTimestampConverter, g, Consumer, NavigationBarView.OnItemSelectedListener, WebViewCompat.WebViewStartUpCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6548b;

    public /* synthetic */ c(Object obj, int i) {
        this.f6547a = i;
        this.f6548b = obj;
    }

    @Override // Rc.b
    public void a(int i) {
        int i4;
        MayaCarousel mayaCarousel = (MayaCarousel) this.f6548b;
        Handler handler = mayaCarousel.f12032u;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (i <= 0) {
            mayaCarousel.b();
            return;
        }
        mayaCarousel.f12028r0 = false;
        mayaCarousel.f();
        mayaCarousel.e.setVisibility(mayaCarousel.f12002W ? 8 : 0);
        RecyclerView recyclerView = mayaCarousel.f;
        recyclerView.setVisibility(0);
        if (mayaCarousel.f12000U && i >= mayaCarousel.f12001V) {
            mayaCarousel.f12036x = 1073741823;
            while (true) {
                i4 = mayaCarousel.f12036x;
                if (i4 % i == 0) {
                    break;
                } else {
                    mayaCarousel.f12036x = i4 + 1;
                }
            }
            recyclerView.scrollToPosition(i4);
            recyclerView.post(new RunnableC0640a(mayaCarousel, 1));
        }
        mayaCarousel.g();
        InterfaceC0642c interfaceC0642c = mayaCarousel.m0;
        if (interfaceC0642c != null) {
            i iVar = (i) ((C1258f0) interfaceC0642c).f11441b;
            iVar.c.setVisibility(0);
            iVar.f16325d.setVisibility(8);
        }
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        switch (this.f6547a) {
            case 26:
                ((SubtitleExtractor) this.f6548b).lambda$parseAndWriteToOutput$0((CuesWithTiming) obj);
                break;
            default:
                ((O) this.f6548b).a((CuesWithTiming) obj);
                break;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) throws Exception {
        switch (this.f6547a) {
            case 7:
                Throwable th2 = (Throwable) obj;
                PayMayaError payMayaErrorF = ((Y7.f) this.f6548b).f(th2, true);
                j.f(payMayaErrorF, "mayaErrorHandling(...)");
                if (payMayaErrorF.isSessionTimeout()) {
                    throw new Exception(th2);
                }
                return new C2342a(null);
            default:
                return ((FragmentedMp4Extractor) this.f6548b).modifyTrack((Track) obj);
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f6547a) {
            case 14:
                return ((CameraRepository) this.f6548b).lambda$deinit$0(completer);
            case 15:
                return ((LiveDataObservable) this.f6548b).lambda$fetchData$1(completer);
            case 16:
                return ((ExtensionsManager) this.f6548b).lambda$shutdown$1(completer);
            default:
                return ((AudioSource) this.f6548b).lambda$release$5(completer);
        }
    }

    public C0621b b(U8.c cVar) throws Exception {
        C0622c c0622c = (C0622c) this.f6548b;
        String strN = v0.n("CctTransportBackend");
        boolean zIsLoggable = Log.isLoggable(strN, 4);
        URL url = (URL) cVar.f5964b;
        if (zIsLoggable) {
            Log.i(strN, String.format("Making request to: %s", url));
        }
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        Callback.openConnection(uRLConnectionOpenConnection);
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(c0622c.f6982g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
        httpURLConnection.setRequestProperty(RtspHeaders.USER_AGENT, "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_ENCODING, "gzip");
        httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) cVar.f5965d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = Callback.getOutputStream(httpURLConnection);
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    C1967a c1967a = c0622c.f6979a;
                    n nVar = (n) cVar.c;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    C2373d c2373d = (C2373d) c1967a.f18783b;
                    C2374e c2374e = new C2374e(bufferedWriter, c2373d.f20679a, c2373d.f20680b, c2373d.c, c2373d.f20681d);
                    c2374e.a(nVar);
                    c2374e.c();
                    c2374e.f20683b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = Callback.getResponseCode(httpURLConnection);
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strN2 = v0.n("CctTransportBackend");
                    if (Log.isLoggable(strN2, 4)) {
                        Log.i(strN2, String.format("Status Code: %d", numValueOf));
                    }
                    v0.e("CctTransportBackend", "Content-Type: %s", Callback.getHeaderField(httpURLConnection, RtspHeaders.CONTENT_TYPE));
                    v0.e("CctTransportBackend", "Content-Encoding: %s", Callback.getHeaderField(httpURLConnection, RtspHeaders.CONTENT_ENCODING));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new C0621b(responseCode, new URL(Callback.getHeaderField(httpURLConnection, RtspHeaders.LOCATION)), 0L);
                    }
                    if (responseCode != 200) {
                        return new C0621b(responseCode, null, 0L);
                    }
                    InputStream inputStream = Callback.getInputStream(httpURLConnection);
                    try {
                        InputStream gZIPInputStream = "gzip".equals(Callback.getHeaderField(httpURLConnection, RtspHeaders.CONTENT_ENCODING)) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            C0621b c0621b = new C0621b(responseCode, null, w.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f8344a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return c0621b;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (EncodingException e) {
            e = e;
            v0.g("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C0621b(YTAGReflectLiveCheckInterface.LightLiveCheckResult.INIT_ERROR, null, 0L);
        } catch (ConnectException e7) {
            e = e7;
            v0.g("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C0621b(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            v0.g("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C0621b(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            v0.g("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new C0621b(YTAGReflectLiveCheckInterface.LightLiveCheckResult.INIT_ERROR, null, 0L);
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public List create(int i, TrackGroup trackGroup, int[] iArr) {
        return DefaultTrackSelector.lambda$selectImageTrack$4((DefaultTrackSelector.Parameters) this.f6548b, i, trackGroup, iArr);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory
    public ExoTrackSelection createAdaptiveTrackSelection(ExoTrackSelection.Definition definition) {
        return ((RandomTrackSelection.Factory) this.f6548b).lambda$createTrackSelections$0(definition);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.f6547a) {
            case 19:
                ((Player.Listener) obj).onTracksChanged((Tracks) this.f6548b);
                break;
            default:
                ((Player.Listener) obj).onMediaMetadataChanged((MediaMetadata) this.f6548b);
                break;
        }
    }

    @Override // G5.t
    public void m(String str, View view) {
        if (j.b(str, "LearnMore")) {
            MayaUpdaterFragment mayaUpdaterFragment = (MayaUpdaterFragment) this.f6548b;
            C1220i c1220iO1 = mayaUpdaterFragment.o1();
            C1219h c1219h = new C1219h();
            c1219h.o(EnumC1215d.FORCED_UPDATE);
            c1219h.n(17);
            c1219h.t(EnumC1217f.ITEM);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219h.j.put("text", "learn_more");
            c1220iO1.b(c1219h);
            k kVar = mayaUpdaterFragment.f11946Y;
            if (kVar != null) {
                MayaUpdaterActivity mayaUpdaterActivity = (MayaUpdaterActivity) kVar;
                mayaUpdaterActivity.n1().x(mayaUpdaterActivity, "https://support.maya.ph/s/article/Why-is-Maya-now-requiring-Android-6-0-or-higher", Boolean.FALSE, false);
            }
        }
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        Uri[] result;
        Uri[] uriArr;
        ActivityResult it = (ActivityResult) obj;
        switch (this.f6547a) {
            case 4:
                j.g(it, "it");
                C0327e c0327e = ((MayaAllowContactsPermissionFragment) this.f6548b).f11898V;
                if (c0327e != null) {
                    c0327e.k();
                    return;
                } else {
                    j.n("mMayaAllowContactsPermissionFragmentPresenter");
                    throw null;
                }
            default:
                j.g(it, "result");
                int resultCode = it.getResultCode();
                MayaWebFragment mayaWebFragment = (MayaWebFragment) this.f6548b;
                if (resultCode == -1) {
                    if (mayaWebFragment.w0 == null || it.getData() != null) {
                        result = WebChromeClient.FileChooserParams.parseResult(it.getResultCode(), it.getData());
                    } else {
                        Uri uri = Uri.parse(mayaWebFragment.w0);
                        mayaWebFragment.w0 = null;
                        result = new Uri[]{uri};
                    }
                    if (result != null) {
                        ArrayList arrayList = new ArrayList(result.length);
                        for (Uri uri2 : result) {
                            j.d(uri2);
                            String strR = AbstractC1955a.r(mayaWebFragment.getContext(), uri2);
                            if (strR == null || !C1129o.p(MayaWebFragment.f11947M0, strR)) {
                                uri2 = Uri.EMPTY;
                            }
                            arrayList.add(uri2);
                        }
                        uriArr = (Uri[]) arrayList.toArray(new Uri[0]);
                    } else {
                        uriArr = null;
                    }
                    if (uriArr != null && C1129o.p(uriArr, Uri.EMPTY)) {
                        Toast.makeText(mayaWebFragment.getContext(), R.string.maya_error_unsupported_webview_upload_file_type, 0).show();
                    }
                    ValueCallback valueCallback = mayaWebFragment.f11954G0;
                    if (valueCallback != null) {
                        valueCallback.onReceiveValue(uriArr);
                    }
                } else {
                    ValueCallback valueCallback2 = mayaWebFragment.f11954G0;
                    if (valueCallback2 != null) {
                        valueCallback2.onReceiveValue(null);
                    }
                }
                mayaWebFragment.f11954G0 = null;
                return;
        }
    }

    @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
    public boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        return InputConnectionCompat.lambda$createOnCommitContentListenerUsingPerformReceiveContent$0((View) this.f6548b, inputContentInfoCompat, i, bundle);
    }

    @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        return NavigationUI.m127setupWithNavController$lambda6((NavController) this.f6548b, menuItem);
    }

    @Override // androidx.webkit.WebViewCompat.WebViewStartUpCallback
    public void onSuccess(WebViewStartUpResult webViewStartUpResult) {
        WebViewCompat.lambda$startUpWebView$1((WebViewCompat.WebViewStartUpCallback) this.f6548b, webViewStartUpResult);
    }

    @Override // Ch.a
    public void run() {
        String name;
        List listUnmodifiableList;
        switch (this.f6547a) {
            case 0:
                ((MayaBaseFragment) ((InterfaceC1349b) ((Lb.a) this.f6548b).c.get())).w1();
                return;
            case 1:
                MayaShopPageFragment mayaShopPageFragment = (MayaShopPageFragment) ((bc.c) ((h) this.f6548b).c.get());
                mayaShopPageFragment.y0 = false;
                mayaShopPageFragment.R1().i();
                return;
            case 2:
                ((MayaBaseFragment) ((d) ((C0214w) this.f6548b).c.get())).w1();
                return;
            case 3:
                MayaShopProviderPageFragment mayaShopProviderPageFragment = (MayaShopProviderPageFragment) ((bc.f) ((Bb.f) this.f6548b).c.get());
                Bb.f fVarP1 = mayaShopProviderPageFragment.P1();
                ShopProvider shopProvider = mayaShopProviderPageFragment.f14049z0;
                if (shopProvider == null || (name = shopProvider.getName()) == null) {
                    name = "";
                }
                String str = name;
                if (str.length() <= 0) {
                    ((MayaShopProviderPageFragment) ((bc.f) fVarP1.c.get())).S1();
                    ((MayaShopProviderPageFragment) ((bc.f) fVarP1.c.get())).R1();
                    return;
                }
                P0 p02 = (P0) fVarP1.e;
                p02.getClass();
                C c = p02.c;
                c.getClass();
                Cursor cursorQuery = c.f11295a.f2811a.query(String.format("SELECT * FROM %1$s WHERE %2$s = \"%3$s\" ORDER BY %4$s ASC, %5$s ASC", Arrays.copyOf(new Object[]{"shop_provider_subcategory", "provider_name", str, "priority", AppMeasurementSdk.ConditionalUserProperty.NAME}, 5)));
                if (cursorQuery == null) {
                    listUnmodifiableList = C1112C.f9377a;
                } else if (cursorQuery.moveToFirst()) {
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    int columnIndex = cursorQuery.getColumnIndex("provider_name");
                    int columnIndex2 = cursorQuery.getColumnIndex(TtmlNode.ATTR_ID);
                    int columnIndex3 = cursorQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    int columnIndex4 = cursorQuery.getColumnIndex("code");
                    int columnIndex5 = cursorQuery.getColumnIndex("priority");
                    do {
                        arrayList.add(new ShopProviderSubcategory(cursorQuery.getString(columnIndex), cursorQuery.getString(columnIndex2), cursorQuery.getString(columnIndex3), cursorQuery.getString(columnIndex4), Integer.valueOf(cursorQuery.getInt(columnIndex5))));
                    } while (cursorQuery.moveToNext());
                    cursorQuery.close();
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                    j.d(listUnmodifiableList);
                } else {
                    cursorQuery.close();
                    listUnmodifiableList = C1112C.f9377a;
                }
                if (!listUnmodifiableList.isEmpty()) {
                    ((MayaShopProviderPageFragment) ((bc.f) fVarP1.c.get())).U1(listUnmodifiableList);
                    return;
                }
                ((MayaShopProviderPageFragment) ((bc.f) fVarP1.c.get())).U1(r.c(new ShopProviderSubcategory(str, "", "", "", null)));
                MayaResizingTabLayout mayaResizingTabLayout = ((MayaShopProviderPageFragment) ((bc.f) fVarP1.c.get())).f14045r0;
                if (mayaResizingTabLayout != null) {
                    mayaResizingTabLayout.setVisibility(8);
                    return;
                } else {
                    j.n("mTabLayoutSubcategories");
                    throw null;
                }
            case 9:
                ((MayaBaseFragment) ((s) ((Z8.a) this.f6548b).c.get())).w1();
                return;
            default:
                ((MayaBaseFragment) ((InterfaceC1507b) ((Z8.c) this.f6548b).c.get())).w1();
                return;
        }
    }

    @Override // androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter
    public long timeUsToTargetTime(long j) {
        return ((FlacStreamMetadata) this.f6548b).getSampleNumber(j);
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        ((SimpleBasePlayer) this.f6548b).lambda$new$0((Player.Listener) obj, flagSet);
    }

    @Override // l0.f
    public void onSuccess(Object obj) {
        D.r rVar = ((p) this.f6548b).f6850g;
        if (rVar.f != null) {
            d0.i(new C.h(rVar, 1));
        }
    }
}
