package D6;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.dynatrace.android.callback.Callback;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.cards.view.fragment.impl.MayaCardsFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f982b;

    public /* synthetic */ a(b bVar, int i) {
        this.f981a = i;
        this.f982b = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EnumC1215d enumC1215d = EnumC1215d.MY_CARDS;
        b bVar = this.f982b;
        switch (this.f981a) {
            case 0:
                Callback.onClick_enter(view);
                try {
                    MayaCardsFragment mayaCardsFragment = bVar.f984b;
                    C1220i c1220i = mayaCardsFragment.f10245B;
                    FragmentActivity activity = mayaCardsFragment.getActivity();
                    C1219h c1219hD = C1219h.d(enumC1215d);
                    c1219hD.n(17);
                    c1219hD.t(EnumC1217f.GET_IT_HERE);
                    c1220i.c(activity, c1219hD);
                    return;
                } finally {
                }
            case 1:
                Callback.onClick_enter(view);
                try {
                    MayaCardsFragment mayaCardsFragment2 = bVar.f984b;
                    C1220i c1220i2 = mayaCardsFragment2.f10245B;
                    FragmentActivity activity2 = mayaCardsFragment2.getActivity();
                    C1219h c1219hD2 = C1219h.d(enumC1215d);
                    c1219hD2.n(17);
                    c1219hD2.t(EnumC1217f.SETTINGS);
                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hD2.j.put(SessionDescription.ATTR_TYPE, "PHYSICAL");
                    c1220i2.c(activity2, c1219hD2);
                    return;
                } finally {
                }
            case 2:
                Callback.onClick_enter(view);
                try {
                    MayaCardsFragment mayaCardsFragment3 = bVar.f984b;
                    C1220i c1220i3 = mayaCardsFragment3.f10245B;
                    FragmentActivity activity3 = mayaCardsFragment3.getActivity();
                    C1219h c1219hD3 = C1219h.d(enumC1215d);
                    c1219hD3.n(17);
                    c1219hD3.t(EnumC1217f.SETTINGS);
                    EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hD3.j.put(SessionDescription.ATTR_TYPE, "VIRTUAL");
                    c1220i3.c(activity3, c1219hD3);
                    return;
                } finally {
                }
            default:
                Callback.onClick_enter(view);
                try {
                    MayaCardsFragment mayaCardsFragment4 = bVar.f984b;
                    C1220i c1220i4 = mayaCardsFragment4.f10245B;
                    FragmentActivity activity4 = mayaCardsFragment4.getActivity();
                    C1219h c1219hD4 = C1219h.d(enumC1215d);
                    c1219hD4.n(17);
                    c1219hD4.t(EnumC1217f.LINK_CARD);
                    EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hD4.j.put(SessionDescription.ATTR_TYPE, "VIRTUAL");
                    c1220i4.c(activity4, c1219hD4);
                    return;
                } finally {
                }
        }
    }

    public /* synthetic */ a(b bVar, String str, String str2) {
        this.f981a = 1;
        this.f982b = bVar;
    }
}
