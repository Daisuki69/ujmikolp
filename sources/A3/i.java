package A3;

import A7.o;
import L9.C0331i;
import Xh.n;
import Xh.p;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.recyclerview.widget.RecyclerView;
import bg.AbstractC0983W;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzku;
import com.google.android.gms.internal.mlkit_vision_face.zzlm;
import com.google.android.gms.internal.mlkit_vision_face.zznr;
import com.google.android.gms.internal.mlkit_vision_face.zzoa;
import com.google.android.gms.internal.mlkit_vision_face.zzof;
import com.journeyapps.barcodescanner.CaptureActivity;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.b0;
import com.paymaya.domain.model.Biller;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.Profile;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaTransactionsFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditTransactionListFragment;
import ia.InterfaceC1596b;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.split.android.client.exceptions.SplitInstantiationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import n3.C1916a;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class i implements zzoa, Ch.c, j2.k, Ah.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f39d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41b;
    public Object c;

    public /* synthetic */ i() {
        this.f40a = 3;
    }

    public static boolean c(Biller biller) {
        kotlin.jvm.internal.j.g(biller, "biller");
        return biller.mActive() != null && kotlin.jvm.internal.j.b(biller.mActive(), Boolean.FALSE);
    }

    @Override // Ah.j
    public void a(io.reactivex.rxjava3.disposables.b bVar) {
        ((Ah.j) this.c).a(bVar);
    }

    @Override // Ch.c
    public void accept(Object obj) {
        switch (this.f40a) {
            case 1:
                o oVar = (o) this.c;
                boolean z4 = this.f41b;
                PayMayaError payMayaErrorF = oVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                if (payMayaErrorF.isSessionTimeout()) {
                    return;
                }
                if (z4) {
                    MayaTransactionsFragment mayaTransactionsFragment = (MayaTransactionsFragment) ((F7.c) oVar.c.get());
                    FragmentActivity fragmentActivityRequireActivity = mayaTransactionsFragment.requireActivity();
                    SpringView springView = mayaTransactionsFragment.f12202p0;
                    if (springView != null) {
                        b0.e(fragmentActivityRequireActivity, springView, null, R.string.maya_label_transactions_initial_load_failed, R.drawable.maya_bg_snackbar_error_small_margin, R.style.JekoBoldSmallText_Snackbar_Error, 0, 0, 852);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
                        throw null;
                    }
                }
                MayaTransactionsFragment mayaTransactionsFragment2 = (MayaTransactionsFragment) ((F7.c) oVar.c.get());
                FragmentActivity fragmentActivityRequireActivity2 = mayaTransactionsFragment2.requireActivity();
                SpringView springView2 = mayaTransactionsFragment2.f12202p0;
                if (springView2 != null) {
                    b0.e(fragmentActivityRequireActivity2, springView2, null, R.string.maya_label_transactions_refresh_failed, R.drawable.maya_bg_snackbar_error_small_margin, R.style.JekoBoldSmallText_Snackbar_Error, 0, 0, 852);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
                    throw null;
                }
            case 4:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                PayMayaError payMayaErrorF2 = ((C0331i) this.c).f(it, true);
                kotlin.jvm.internal.j.f(payMayaErrorF2, "mayaErrorHandling(...)");
                C0331i c0331i = (C0331i) this.c;
                boolean z5 = this.f41b;
                c0331i.getClass();
                if (!payMayaErrorF2.isSessionTimeout()) {
                    if (z5) {
                        MayaCreditTransactionListFragment mayaCreditTransactionListFragment = (MayaCreditTransactionListFragment) ((P9.c) c0331i.c.get());
                        FragmentActivity fragmentActivityRequireActivity3 = mayaCreditTransactionListFragment.requireActivity();
                        SpringView springView3 = mayaCreditTransactionListFragment.f13113p0;
                        if (springView3 == null) {
                            kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
                            throw null;
                        }
                        b0.e(fragmentActivityRequireActivity3, springView3, null, R.string.maya_label_transactions_initial_load_failed, R.drawable.maya_bg_snackbar_error_small_margin, R.style.JekoBoldSmallText_Snackbar_Error, 0, 0, 852);
                    } else {
                        MayaCreditTransactionListFragment mayaCreditTransactionListFragment2 = (MayaCreditTransactionListFragment) ((P9.c) c0331i.c.get());
                        FragmentActivity fragmentActivityRequireActivity4 = mayaCreditTransactionListFragment2.requireActivity();
                        SpringView springView4 = mayaCreditTransactionListFragment2.f13113p0;
                        if (springView4 == null) {
                            kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
                            throw null;
                        }
                        b0.e(fragmentActivityRequireActivity4, springView4, null, R.string.maya_label_transactions_refresh_failed, R.drawable.maya_bg_snackbar_error_small_margin, R.style.JekoBoldSmallText_Snackbar_Error, 0, 0, 852);
                    }
                }
                ((C0331i) this.c).m(payMayaErrorF2, it);
                return;
            default:
                Profile profile = (Profile) obj;
                kotlin.jvm.internal.j.g(profile, "profile");
                com.paymaya.data.preference.a aVar = ((Q6.o) this.c).f5285g;
                if (aVar.e().isPartnerOnboardingEnabled() && aVar.K()) {
                    String strP = aVar.p();
                    kotlin.jvm.internal.j.f(strP, "getMayaOnboardingPartner(...)");
                    C.s0(aVar, strP, false);
                }
                ((MayaBaseFragment) ((X6.f) ((Q6.o) this.c).c.get())).w1();
                ((Q6.o) this.c).q(profile, this.f41b);
                return;
        }
    }

    @Override // j2.k
    public void b(j2.j jVar, int i) {
        boolean z4 = this.f41b;
        StringBuilder sb2 = (StringBuilder) this.c;
        if (z4) {
            this.f41b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i);
    }

    public void d() {
        this.f41b = false;
    }

    public void e() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnCompletionListener(new H3.c());
        mediaPlayer.setOnErrorListener(new H3.d());
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = ((Context) this.c).getResources().openRawResourceFd(R.raw.zxing_beep);
            try {
                mediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                assetFileDescriptorOpenRawResourceFd.close();
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (Throwable th2) {
                assetFileDescriptorOpenRawResourceFd.close();
                throw th2;
            }
        } catch (IOException e) {
            Log.w(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, e);
            mediaPlayer.release();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, ia.b] */
    public void f(Biller biller) {
        List<String> listMPaymentMethod;
        kotlin.jvm.internal.j.g(biller, "biller");
        String strO = C.O(biller.mListUrl());
        ?? r1 = (RecyclerView.ViewHolder) this.c;
        r1.z(strO);
        String strMName = biller.mName();
        if (strMName != null) {
            r1.A(strMName);
        }
        if (c(biller)) {
            r1.u();
        } else {
            r1.h();
        }
        if (c(biller)) {
            return;
        }
        if (this.f41b && !c(biller) && (listMPaymentMethod = biller.mPaymentMethod()) != null) {
            Z9.a[] aVarArr = Z9.a.f6919a;
            if (listMPaymentMethod.contains("mayaCredit")) {
                r1.r();
                return;
            }
        }
        r1.v();
    }

    public void g(char c) {
        Ri.a aVar = (Ri.a) this.c;
        aVar.j(aVar.f5558b, 1);
        char[] cArr = (char[]) aVar.c;
        int i = aVar.f5558b;
        aVar.f5558b = i + 1;
        cArr[i] = c;
    }

    public void h() {
    }

    public void i() {
    }

    @Override // Ah.j
    public void onComplete() {
        if (this.f41b) {
            return;
        }
        ((Ah.j) this.c).onComplete();
    }

    @Override // Ah.j
    public void onError(Throwable th2) {
        if (!this.f41b) {
            ((Ah.j) this.c).onError(th2);
            return;
        }
        AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
        assertionError.initCause(th2);
        E1.c.k(assertionError);
    }

    @Override // Ah.j
    public void onNext(Object obj) {
        Response response = (Response) obj;
        boolean zIsSuccessful = response.isSuccessful();
        Ah.j jVar = (Ah.j) this.c;
        if (zIsSuccessful) {
            jVar.onNext(response.body());
            return;
        }
        this.f41b = true;
        HttpException httpException = new HttpException(response);
        try {
            jVar.onError(httpException);
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            E1.c.k(new CompositeException(httpException, th2));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzoa
    public zznr zza() {
        zzku zzkuVar = new zzku();
        zzkuVar.zze(this.f41b ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
        zzlm zzlmVar = new zzlm();
        zzlmVar.zzb((zzks) this.c);
        zzkuVar.zzh(zzlmVar.zzc());
        return zzof.zzf(zzkuVar);
    }

    public /* synthetic */ i(Object obj, int i) {
        this.f40a = i;
        this.c = obj;
        this.f41b = true;
    }

    public /* synthetic */ i(Object obj, boolean z4, int i) {
        this.f40a = i;
        this.c = obj;
        this.f41b = z4;
    }

    public /* synthetic */ i(boolean z4, zzks zzksVar) {
        this.f40a = 0;
        this.f41b = z4;
        this.c = zzksVar;
    }

    public i(Context context, Integer num, String str) {
        n nVar;
        this.f40a = 9;
        List flagSets = W5.d.f6313a;
        kotlin.jvm.internal.j.g(flagSets, "flagSets");
        Yh.a aVar = new Yh.a(str);
        String str2 = Xh.d.f6631k;
        new Q3.b(3).a();
        long j = Xh.d.j;
        C1916a c1916a = new C1916a(18);
        int iIntValue = (num != null ? num.intValue() : 10) * 1000;
        Q3.b bVar = new Q3.b(3);
        p pVar = new p(flagSets, new Si.d());
        ((ArrayList) bVar.c).add(pVar);
        bVar.f5203a += pVar.c;
        bVar.f5204b += pVar.f6671d;
        Ff.f fVarA = bVar.a();
        String str3 = "maya_";
        Ri.a.l().f5558b = -100;
        Cg.c cVar = !"maya_".matches("^[a-zA-Z0-9_]{1,80}$") ? new Cg.c(200, "Prefix can only contain alphanumeric characters and underscore, and must be 80 characters or less", false) : null;
        if (cVar != null) {
            Ri.a.g((String) cVar.c);
            Ri.a.q("Setting prefix to empty string");
            str3 = "";
        }
        String str4 = str3;
        if (3600000 < Xh.d.h || 3600000 > Xh.d.i) {
            Ri.a.q("Time interval for impressions dedupe is out of bounds. Setting to default value.");
        }
        Xh.d dVar = new Xh.d(iIntValue, null, fVarA, (Math.random() * 1001.0d) / 1000.0d <= 0.001d, str4, j, c1916a);
        synchronized (Xh.i.class) {
            try {
                nVar = new n(aVar, dVar, context);
            } catch (Exception e) {
                if (e instanceof SplitInstantiationException) {
                    throw ((SplitInstantiationException) e);
                }
                throw new SplitInstantiationException("Could not instantiate SplitFactory", e);
            }
        }
        this.c = nVar;
        this.f41b = true;
        yk.a.a();
        flagSets.toString();
        yk.a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(InterfaceC1596b interfaceC1596b, boolean z4) {
        this.f40a = 11;
        this.c = (RecyclerView.ViewHolder) interfaceC1596b;
        this.f41b = z4;
    }

    public i(List list) {
        this.f40a = 10;
        this.c = new HashSet(list);
        this.f41b = !r0.isEmpty();
    }

    public i(Ah.j jVar) {
        this.f40a = 14;
        this.c = jVar;
    }

    public i(CaptureActivity captureActivity) {
        this.f40a = 2;
        this.f41b = true;
        captureActivity.setVolumeControlStream(3);
        this.c = captureActivity.getApplicationContext();
    }
}
