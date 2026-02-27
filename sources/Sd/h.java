package sd;

import android.content.Intent;
import android.net.Uri;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.ui.ekyc.view.activity.impl.EKycPhotoCaptureActivity;
import com.paymaya.ui.ekyc.view.dialog.impl.EkycPhotoCaptureTutorialDialogFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EKycPhotoCaptureFragment;
import dOYHB6.tiZVw8.numX49;
import java.io.IOException;
import kotlin.jvm.internal.j;
import o1.AbstractC1955a;
import v0.C2333a;
import w3.C2376a;
import y3.C2503d;
import y5.AbstractC2509a;
import yd.l;
import zd.v;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20046d;
    public String e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.paymaya.data.preference.a f20047g;
    public int h;

    public h(com.paymaya.data.preference.a aVar) {
        j.g(aVar, numX49.tnTj78("bFGPj"));
        this.h = 1;
        this.f20046d = 1;
        this.f20047g = aVar;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        v vVar;
        super.j();
        if (((EKycPhotoCaptureFragment) ((l) this.c.get())).m0 && (vVar = ((EKycPhotoCaptureFragment) ((l) this.c.get())).f14579h0) != null) {
            new EkycPhotoCaptureTutorialDialogFragment().show(((EKycPhotoCaptureActivity) vVar).getSupportFragmentManager(), numX49.tnTj78("bFGPd"));
        }
        boolean zU = AbstractC1955a.u(((EKycPhotoCaptureFragment) ((l) this.c.get())).getContext(), numX49.tnTj78("bFGPi"));
        String strTnTj78 = numX49.tnTj78("bFGPE");
        if (!zU) {
            Group group = ((EKycPhotoCaptureFragment) ((l) this.c.get())).f14568W;
            if (group != null) {
                group.setVisibility(0);
                return;
            } else {
                j.n(strTnTj78);
                throw null;
            }
        }
        Group group2 = ((EKycPhotoCaptureFragment) ((l) this.c.get())).f14568W;
        if (group2 == null) {
            j.n(strTnTj78);
            throw null;
        }
        group2.setVisibility(8);
        n();
    }

    public final void k() {
        if (!((EKycPhotoCaptureFragment) ((l) this.c.get())).u1()) {
            ((EKycPhotoCaptureFragment) ((l) this.c.get())).s1();
            return;
        }
        EKycPhotoCaptureFragment eKycPhotoCaptureFragment = (EKycPhotoCaptureFragment) ((l) this.c.get());
        TextView textView = eKycPhotoCaptureFragment.f14567V;
        String strTnTj78 = numX49.tnTj78("bFGPF");
        if (textView == null) {
            j.n(strTnTj78);
            throw null;
        }
        textView.setVisibility(0);
        TextView textView2 = eKycPhotoCaptureFragment.f14567V;
        if (textView2 == null) {
            j.n(strTnTj78);
            throw null;
        }
        textView2.setText(eKycPhotoCaptureFragment.getString(R.string.pma_label_ekyc_blurry_image_warning));
        this.h = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sd.h.l():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r7 = this;
            int r0 = r7.f20046d
            int r0 = r0 + (-1)
            r7.f20046d = r0
            java.lang.ref.WeakReference r0 = r7.c
            java.lang.Object r0 = r0.get()
            yd.l r0 = (yd.l) r0
            com.paymaya.ui.ekyc.view.fragment.impl.EKycPhotoCaptureFragment r0 = (com.paymaya.ui.ekyc.view.fragment.impl.EKycPhotoCaptureFragment) r0
            java.lang.String r0 = r0.f14583l0
            if (r0 == 0) goto L7c
            int r1 = r0.hashCode()
            r2 = 2
            r3 = 4
            r4 = 6
            r5 = 3
            r6 = 1
            switch(r1) {
                case -1554197861: goto L64;
                case 766560474: goto L47;
                case 766619540: goto L3a;
                case 1988079179: goto L21;
                default: goto L20;
            }
        L20:
            goto L7c
        L21:
            java.lang.String r1 = "bFGPU"
            java.lang.String r1 = dOYHB6.tiZVw8.numX49.tnTj78(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
            goto L7c
        L2e:
            int r0 = r7.f20046d
            if (r0 != r3) goto L35
            r7.f20046d = r5
            goto L7c
        L35:
            if (r0 >= r5) goto L7c
            r7.f20046d = r4
            goto L7c
        L3a:
            java.lang.String r1 = "bFGPe"
            java.lang.String r1 = dOYHB6.tiZVw8.numX49.tnTj78(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L71
            goto L7c
        L47:
            java.lang.String r1 = "bFGP8"
            java.lang.String r1 = dOYHB6.tiZVw8.numX49.tnTj78(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7c
            int r0 = r7.f20046d
            if (r0 != r2) goto L5a
            r7.f20046d = r6
            goto L7c
        L5a:
            if (r0 != r3) goto L5f
            r7.f20046d = r5
            goto L7c
        L5f:
            if (r0 >= r6) goto L7c
            r7.f20046d = r4
            goto L7c
        L64:
            java.lang.String r1 = "bFGPC"
            java.lang.String r1 = dOYHB6.tiZVw8.numX49.tnTj78(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L71
            goto L7c
        L71:
            int r0 = r7.f20046d
            if (r0 != r2) goto L78
            r7.f20046d = r6
            goto L7c
        L78:
            if (r0 >= r6) goto L7c
            r7.f20046d = r4
        L7c:
            r7.o()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sd.h.m():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sd.h.n():void");
    }

    public final void o() {
        Task taskAddOnSuccessListener;
        yk.a.a();
        int i = this.f20046d;
        String strTnTj78 = numX49.tnTj78("bFGPm");
        switch (i) {
            case 1:
                ((EKycPhotoCaptureFragment) ((l) this.c.get())).E1();
                ((EKycPhotoCaptureFragment) ((l) this.c.get())).t1();
                break;
            case 2:
                if (!z.o(((EKycPhotoCaptureFragment) ((l) this.c.get())).f14583l0, strTnTj78, true)) {
                    EKycPhotoCaptureFragment eKycPhotoCaptureFragment = (EKycPhotoCaptureFragment) ((l) this.c.get());
                    String string = eKycPhotoCaptureFragment.getString(R.string.pma_progress_message_please_wait);
                    C.R(eKycPhotoCaptureFragment.getActivity());
                    eKycPhotoCaptureFragment.f10247P.setTitle(numX49.tnTj78("bFGP6"));
                    eKycPhotoCaptureFragment.f10247P.setMessage(string);
                    eKycPhotoCaptureFragment.f10247P.setCancelable(false);
                    eKycPhotoCaptureFragment.f10247P.show();
                    EKycPhotoCaptureFragment eKycPhotoCaptureFragment2 = (EKycPhotoCaptureFragment) ((l) this.c.get());
                    eKycPhotoCaptureFragment2.getClass();
                    try {
                        C2376a c2376aA = C2376a.a(eKycPhotoCaptureFragment2.requireContext(), Uri.fromFile(eKycPhotoCaptureFragment2.f14580i0));
                        C2503d c2503d = eKycPhotoCaptureFragment2.f14585o0;
                        j.d(c2503d);
                        Preconditions.checkNotNull(c2503d, "You must provide a valid FaceDetectorOptions.");
                        A3.d dVar = (A3.d) p3.g.c().a(A3.d.class);
                        dVar.getClass();
                        Preconditions.checkNotNull(c2503d, "You must provide a valid FaceDetectorOptions.");
                        A3.a aVar = new A3.a((A3.h) dVar.f29a.get(c2503d), dVar.f30b, c2503d);
                        eKycPhotoCaptureFragment2.u0 = aVar;
                        Task taskB = aVar.b(c2376aA);
                        if (taskB != null && (taskAddOnSuccessListener = taskB.addOnSuccessListener(new y9.d(new com.squareup.wire.internal.a(eKycPhotoCaptureFragment2, 29), 6))) != null) {
                            taskAddOnSuccessListener.addOnFailureListener(new C2333a(5));
                        }
                    } catch (IOException unused) {
                        yk.a.e();
                    }
                }
                ((EKycPhotoCaptureFragment) ((l) this.c.get())).F1();
                k();
                break;
            case 3:
                ((EKycPhotoCaptureFragment) ((l) this.c.get())).D1();
                ((EKycPhotoCaptureFragment) ((l) this.c.get())).t1();
                break;
            case 4:
                ((EKycPhotoCaptureFragment) ((l) this.c.get())).F1();
                k();
                break;
            case 5:
                String str = this.f;
                String strTnTj782 = numX49.tnTj78("bFGPD");
                String strTnTj783 = numX49.tnTj78("bFGPh");
                if (str == null || C2576A.H(str)) {
                    l lVar = (l) this.c.get();
                    String str2 = this.e;
                    v vVar = ((EKycPhotoCaptureFragment) lVar).f14579h0;
                    if (vVar != null) {
                        EKycPhotoCaptureActivity eKycPhotoCaptureActivity = (EKycPhotoCaptureActivity) vVar;
                        Intent intent = new Intent();
                        intent.putExtra(strTnTj783, str2);
                        intent.putExtra(strTnTj782, eKycPhotoCaptureActivity.getIntent().getStringExtra(strTnTj782));
                        Intent intent2 = eKycPhotoCaptureActivity.getIntent();
                        String strTnTj784 = numX49.tnTj78("bFGPN");
                        intent.putExtra(strTnTj784, intent2.getStringExtra(strTnTj784));
                        eKycPhotoCaptureActivity.setResult(-1, intent);
                        eKycPhotoCaptureActivity.finish();
                    }
                } else {
                    l lVar2 = (l) this.c.get();
                    String str3 = this.e;
                    String str4 = this.f;
                    v vVar2 = ((EKycPhotoCaptureFragment) lVar2).f14579h0;
                    if (vVar2 != null) {
                        EKycPhotoCaptureActivity eKycPhotoCaptureActivity2 = (EKycPhotoCaptureActivity) vVar2;
                        Intent intent3 = new Intent();
                        intent3.putExtra(strTnTj783, str3);
                        intent3.putExtra(numX49.tnTj78("bFGPM"), str4);
                        intent3.putExtra(strTnTj782, eKycPhotoCaptureActivity2.getIntent().getStringExtra(strTnTj782));
                        eKycPhotoCaptureActivity2.setResult(-1, intent3);
                        eKycPhotoCaptureActivity2.finish();
                    }
                }
                break;
            case 6:
                v vVar3 = ((EKycPhotoCaptureFragment) ((l) this.c.get())).f14579h0;
                if (vVar3 != null) {
                    ((EKycPhotoCaptureActivity) vVar3).finish();
                }
                break;
        }
        if (strTnTj78.equals(((EKycPhotoCaptureFragment) ((l) this.c.get())).f14583l0)) {
            TextView textView = ((EKycPhotoCaptureFragment) ((l) this.c.get())).f14566U;
            if (textView == null) {
                j.n(numX49.tnTj78("bFGPa"));
                throw null;
            }
            textView.setText(R.string.pma_label_ekyc_instruction_document_capture);
            ((EKycPhotoCaptureFragment) ((l) this.c.get())).s1();
        }
    }
}
