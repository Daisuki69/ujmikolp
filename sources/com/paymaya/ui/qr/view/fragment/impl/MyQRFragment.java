package com.paymaya.ui.qr.view.fragment.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.OnClick;
import com.google.zxing.WriterException;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.T;
import com.paymaya.common.utility.Z;
import de.k;
import java.util.HashMap;
import mg.c;
import org.json.JSONException;
import org.json.JSONObject;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public class MyQRFragment extends BaseFragment {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Lb.a f14683S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public k f14684T;

    @BindView(R.id.qr_code_image_view_pma_fragment_my_qr)
    ImageView mImageViewQR;

    @BindView(R.id.name_text_view_pma_fragment_my_qr)
    TextView mTextViewName;

    @BindView(R.id.number_text_view_pma_fragment_my_qr)
    TextView mTextViewNumber;

    public final void S0(String str, String str2) {
        this.mTextViewNumber.setText(C.s(str));
        this.mImageViewQR.setImageBitmap(Z.b(getActivity(), str2, 2131231989));
    }

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1215d m1() {
        return EnumC1215d.REQUEST_MONEY;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        this.f14684T = (k) getActivity();
        O5.a aVar = (O5.a) W4.a.e().E().c;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        Lb.a aVar2 = new Lb.a((com.paymaya.data.preference.a) aVar.e.get(), aVar.X(), aVar.v(), aVar.c());
        this.f14683S = aVar2;
        aVar2.h(this);
        Z.a(getActivity(), 1.0f);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.pma_fragment_my_qr, viewGroup, false);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f14683S.i();
        super.onDestroy();
    }

    @OnClick({R.id.request_money_instruction_text_view_pma_fragment_my_qr})
    public void onHowRequestMoneyLinkWorksClick() {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.GUIDE);
        o1(c1219hH);
        this.f14684T.F0();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f14684T.Q(this);
        C1219h c1219h = new C1219h();
        c1219h.n(2);
        o1(c1219h);
    }

    @OnClick({R.id.send_request_money_link_button_pma_fragment_my_qr})
    public void onSendRequestLinkClick() {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.SEND_REQUEST);
        o1(c1219hH);
        this.f14684T.r0();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f14683S.j();
    }

    public final void r1(String str) {
        Bitmap bitmapL;
        int i = 1;
        this.mTextViewNumber.setText(C.s(str));
        ImageView imageView = this.mImageViewQR;
        FragmentActivity activity = getActivity();
        T t5 = Z.f10458a;
        if (str.isEmpty()) {
            bitmapL = null;
        } else {
            c cVar = new c(i);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("v", str);
                jSONObject.put("t", "PAYMAYA");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("r", jSONObject);
                HashMap map = new HashMap();
                map.put(C3.c.f706a, d4.c.H);
                K3.b bVarE = cVar.e(jSONObject2.toString(), C3.a.f694l, Z.h(activity), Z.h(activity), map);
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(activity.getResources(), 2131231986);
                int i4 = bVarE.f2589a;
                int i6 = bVarE.f2590b;
                int[] iArr = new int[i4 * i6];
                for (int i10 = 0; i10 < i6; i10++) {
                    int i11 = i10 * i4;
                    for (int i12 = 0; i12 < i4; i12++) {
                        iArr[i11 + i12] = bVarE.b(i12, i10) ? -16777216 : -1;
                    }
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i4, i6, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.setPixels(iArr, 0, i4, 0, 0, i4, i6);
                bitmapL = Z.l(bitmapDecodeResource, bitmapCreateBitmap);
            } catch (WriterException | JSONException unused) {
                yk.a.b();
                bitmapL = null;
            }
        }
        imageView.setImageBitmap(bitmapL);
    }

    public final void s1(String str) {
        this.mTextViewName.setText(str);
    }
}
