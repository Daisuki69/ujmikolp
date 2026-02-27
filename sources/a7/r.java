package A7;

import L9.B;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.impl.Config;
import androidx.camera.extensions.internal.RequestOptionConfig;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import androidx.media3.extractor.text.ttml.TtmlNode;
import b5.AbstractC0911c;
import b5.C0914f;
import b5.C0918j;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.paymaya.domain.model.CreditResponse;
import com.paymaya.domain.model.ShopHomeSectionCarousel;
import com.paymaya.domain.model.ShopProviderBase;
import com.paymaya.domain.store.O0;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopHomePageFragment;
import com.paymaya.ui.login.view.activity.impl.DeepLinkActivity;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements Ch.a, l0.f, FragmentResultListener, NestedScrollView.OnScrollChangeListener, pg.s, Ch.f, Ch.c, OnCompleteListener, OnFailureListener, b2.c, SuccessContinuation, Continuation, NativeAd.OnNativeAdLoadedListener, NativeCustomFormatAd.OnCustomFormatAdLoadedListener, Config.OptionMatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f235b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r(int i, Object obj, Object obj2) {
        this.f234a = i;
        this.f235b = obj;
        this.c = obj2;
    }

    private final Object a(Task task) {
        X2.j jVar = (X2.j) this.f235b;
        Date date = (Date) this.c;
        jVar.getClass();
        if (task.isSuccessful()) {
            X2.o oVar = jVar.h;
            synchronized (oVar.f6519b) {
                oVar.f6518a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
            return task;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return task;
        }
        if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
            jVar.h.i();
            return task;
        }
        jVar.h.h();
        return task;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        Ld.a aVar = (Ld.a) this.f235b;
        String str = (String) this.c;
        aVar.getClass();
        if (((Ze.a) obj).f6934b) {
            ((DeepLinkActivity) ((Md.a) aVar.c.get())).t1(RtspHeaders.ALLOW);
        } else {
            ((DeepLinkActivity) ((Md.a) aVar.c.get())).t1("Deny");
        }
        aVar.n(str);
    }

    @Override // Ch.f
    public Object apply(Object obj) throws Exception {
        switch (this.f234a) {
            case 10:
                Throwable throwable = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable, "throwable");
                B b8 = (B) this.f235b;
                if (b8.f(throwable, true).isSessionTimeout()) {
                    throw new Exception(throwable);
                }
                b8.z();
                return (CreditResponse) this.c;
            default:
                Xb.f fVar = (Xb.f) this.f235b;
                ShopHomeSectionCarousel shopHomeSectionCarousel = (ShopHomeSectionCarousel) this.c;
                Throwable throwable2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable2, "throwable");
                O0 o02 = fVar.f6567d;
                List listB = o02.c.b(new M2.b(9));
                List list = listB;
                if (list == null || list.isEmpty()) {
                    ((MayaShopHomePageFragment) ((bc.b) fVar.c.get())).T1("Brands for you");
                    return new Pair(null, throwable2);
                }
                shopHomeSectionCarousel.setList(listB);
                ((MayaShopHomePageFragment) ((bc.b) fVar.c.get())).Q1(shopHomeSectionCarousel);
                return new Pair(new ShopProviderBase(listB, null), throwable2);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task it) {
        kotlin.jvm.internal.j.g(it, "it");
        ((Function0) this.f235b).invoke();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.getDefault());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(5, 90);
        androidx.media3.datasource.cache.c.u(com.paymaya.data.preference.a.j((FragmentActivity) this.c).f11330b, "key_in_app_review_date", simpleDateFormat.format(calendar.getTime()));
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener
    public void onCustomFormatAdLoaded(NativeCustomFormatAd ad2) {
        kotlin.jvm.internal.j.g(ad2, "ad");
        ((Bj.r) this.c).T(new C0914f(ad2, (AbstractC0911c) ((Function1) this.f235b).invoke(ad2)));
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception it) {
        kotlin.jvm.internal.j.g(it, "it");
        ((Ne.d) this.f235b).b(it, (N9.f) this.c);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // androidx.fragment.app.FragmentResultListener
    public void onFragmentResult(String str, Bundle bundle) {
        kotlin.jvm.internal.j.g(str, "<unused var>");
        kotlin.jvm.internal.j.g(bundle, "bundle");
        Parcelable parcelable = bundle.getParcelable((String) this.c);
        if (parcelable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ((kotlin.jvm.internal.i) this.f235b).invoke(parcelable);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x052d, code lost:
    
        if (r12.equals("dismiss") == false) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0675, code lost:
    
        if (r12.equals("complete") == false) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0681, code lost:
    
        if (kotlin.jvm.internal.j.b(r5, r6.d()) == false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0683, code lost:
    
        r6.i();
        r6.e().b(new A7.c(r6, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0693, code lost:
    
        r1 = r6.f1833s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0695, code lost:
    
        if (r1 == null) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x069b, code lost:
    
        if (kotlin.jvm.internal.j.b(r5, r1) == false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x069d, code lost:
    
        r6.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x06a1, code lost:
    
        r1 = r6.f1835u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x06a3, code lost:
    
        if (r1 == null) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x06a9, code lost:
    
        if (kotlin.jvm.internal.j.b(r5, r1) == false) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x06ab, code lost:
    
        io.flutter.embedding.engine.FlutterEngineCache.getInstance().remove("checkoutFullscreen");
        r6.o();
        r6.e().b(new A7.c(r6, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x06c4, code lost:
    
        r1 = (com.paymaya.mayaui.dashboard.view.fragment.impl.MayaDashboardFragment) ((F7.a) r6.f1831A.c.get());
        r3 = r1.f12165e0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x06d4, code lost:
    
        if (r3 == null) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x06d6, code lost:
    
        r3.i();
        r1 = r1.f12165e0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x06db, code lost:
    
        if (r1 == null) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x06dd, code lost:
    
        r1.e().b(new A7.c(r1, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x06e9, code lost:
    
        r20.success(java.lang.Boolean.TRUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x06f0, code lost:
    
        kotlin.jvm.internal.j.n("cardsFlutterScreen");
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x06f3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x06f4, code lost:
    
        kotlin.jvm.internal.j.n("cardsFlutterScreen");
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x06f7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x06f8, code lost:
    
        kotlin.jvm.internal.j.n("flutterCheckoutActivityIntent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x06fb, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x06fc, code lost:
    
        kotlin.jvm.internal.j.n("flutterUsernameActivityIntent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x06ff, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:?, code lost:
    
        return;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // pg.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMethodCall(pg.r r19, pg.t r20) {
        /*
            Method dump skipped, instruction units count: 2026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.r.onMethodCall(pg.r, pg.t):void");
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public void onNativeAdLoaded(NativeAd ad2) {
        kotlin.jvm.internal.j.g(ad2, "ad");
        ((kotlin.jvm.internal.y) this.f235b).f18195a = ad2;
        ((Bj.r) this.c).T(new C0918j(ad2));
    }

    @Override // androidx.camera.core.impl.Config.OptionMatcher
    public boolean onOptionMatched(Config.Option option) {
        switch (this.f234a) {
            case 28:
                return CaptureRequestOptions.Builder.lambda$from$0((CaptureRequestOptions.Builder) this.f235b, (Config) this.c, option);
            default:
                return RequestOptionConfig.Builder.lambda$from$0((RequestOptionConfig.Builder) this.f235b, (Config) this.c, option);
        }
    }

    @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
    public void onScrollChange(NestedScrollView scrollView, int i, int i4, int i6, int i10) {
        kotlin.jvm.internal.j.g(scrollView, "scrollView");
        int height = scrollView.getChildAt(0).getHeight() - scrollView.getHeight();
        View view = (View) this.f235b;
        int height2 = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int paddingTop = view.getPaddingTop() + height2 + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        Function2 function2 = (Function2) this.c;
        if (height <= paddingTop) {
            view.setVisibility(0);
            function2.invoke(Float.valueOf(1.0f), Boolean.TRUE);
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        view.getGlobalVisibleRect(rect);
        scrollView.getGlobalVisibleRect(rect2);
        float f = rect.bottom - rect2.top;
        if (f < 0.0f) {
            f = 0.0f;
        }
        float height3 = view.getHeight();
        if (f > height3) {
            f = height3;
        }
        float height4 = f / view.getHeight();
        view.setVisibility(height4 > 0.0f ? 0 : 4);
        function2.invoke(Float.valueOf(height4), Boolean.valueOf(height4 > 0.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        if (r2.isConnected() != false) goto L33;
     */
    @Override // l0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSuccess(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.r.onSuccess(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0133  */
    @Override // Ch.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instruction units count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.r.run():void");
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        X2.d dVar = (X2.d) this.f235b;
        X2.f fVar = (X2.f) this.c;
        synchronized (dVar) {
            dVar.c = Tasks.forResult(fVar);
        }
        return Tasks.forResult(fVar);
    }

    @Override // b2.c
    public Object v(Xh.b bVar) {
        String strValueOf;
        Context context = (Context) bVar.get(Context.class);
        switch (((C2.f) this.c).f680a) {
            case 13:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                strValueOf = applicationInfo == null ? "" : String.valueOf(applicationInfo.targetSdkVersion);
                break;
            case 14:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                strValueOf = (applicationInfo2 != null && Build.VERSION.SDK_INT >= 24) ? String.valueOf(applicationInfo2.minSdkVersion) : "";
                break;
            case 15:
                strValueOf = !context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? !context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? (Build.VERSION.SDK_INT >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "embedded" : "" : TtmlNode.TEXT_EMPHASIS_AUTO : "watch" : com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.f16146k;
                break;
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                strValueOf = installerPackageName == null ? "" : FirebaseCommonRegistrar.a(installerPackageName);
                break;
        }
        return new V2.a((String) this.f235b, strValueOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ r(String str, Function1 function1) {
        this.f234a = 3;
        this.f235b = (kotlin.jvm.internal.i) function1;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d2 A[Catch: all -> 0x0055, TryCatch #2 {all -> 0x0055, blocks: (B:11:0x003c, B:14:0x0041, B:15:0x0042, B:23:0x005d, B:56:0x00ce, B:58:0x00d2, B:59:0x00d6), top: B:102:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #2 {all -> 0x0055, blocks: (B:11:0x003c, B:14:0x0041, B:15:0x0042, B:23:0x005d, B:56:0x00ce, B:58:0x00d2, B:59:0x00d6), top: B:102:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011b  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r14v27, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r14v3, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r14v40, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r14v44, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v52 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X2.m] */
    @Override // com.google.android.gms.tasks.Continuation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object then(com.google.android.gms.tasks.Task r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.r.then(com.google.android.gms.tasks.Task):java.lang.Object");
    }
}
