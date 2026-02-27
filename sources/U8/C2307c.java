package u8;

import D.C0176i;
import D.C0187u;
import D.S;
import N5.C0440b1;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.paymaya.R;
import com.paymaya.domain.model.InboxMessage;
import com.paymaya.domain.store.C1250b0;
import com.paymaya.mayaui.inbox.view.activity.impl.MayaInboxDetailsActivity;
import com.paymaya.mayaui.inbox.view.activity.impl.MayaInboxV2Activity;
import com.paymaya.mayaui.inbox.view.fragment.impl.MayaInboxPageFragment;
import kotlin.jvm.internal.j;
import o6.f;
import t8.e;

/* JADX INFO: renamed from: u8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2307c extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MayaInboxPageFragment f20278b;
    public final C0440b1 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f20279d;
    public InboxMessage e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2307c(C0440b1 c0440b1, Context mContext, MayaInboxPageFragment mInboxItemViewHolderListener) {
        super(c0440b1.f4062b);
        j.g(mContext, "mContext");
        j.g(mInboxItemViewHolderListener, "mInboxItemViewHolderListener");
        this.f20277a = mContext;
        this.f20278b = mInboxItemViewHolderListener;
        this.c = c0440b1;
        this.f20279d = new f(this, 2);
    }

    public static final void D(C2307c c2307c, boolean z4, boolean z5) {
        CTInboxMessage cTInboxMessageG;
        c2307c.E(z4, z5);
        MayaInboxPageFragment mayaInboxPageFragment = c2307c.f20278b;
        InboxMessage inboxMessage = c2307c.e;
        p8.b bVar = mayaInboxPageFragment.f12411V;
        if (bVar == null) {
            j.n("mInboxPageFragmentPresenter");
            throw null;
        }
        j.g(inboxMessage, "inboxMessage");
        C1250b0 c1250b0 = bVar.f19075d;
        String mId = inboxMessage.mId();
        c1250b0.getClass();
        j.g(mId, "mId");
        C0187u c0187u = c1250b0.f11427b;
        if ((c0187u == null || (cTInboxMessageG = c0187u.g(mId)) == null || !cTInboxMessageG.f9560k) && c0187u != null) {
            c0187u.k(c0187u.g(mId));
        }
        s8.c cVar = (s8.c) bVar.c.get();
        String id = inboxMessage.mId();
        MayaInboxPageFragment mayaInboxPageFragment2 = (MayaInboxPageFragment) cVar;
        mayaInboxPageFragment2.getClass();
        j.g(id, "id");
        C0187u c0187u2 = mayaInboxPageFragment2.o1().f11213b;
        c0187u2.getClass();
        S.l("CleverTapAPI:pushInboxNotificationViewedEvent() called with: messageId = [" + id + "]");
        ((C0176i) c0187u2.f949b.f).s(false, c0187u2.g(id), null);
        MayaInboxPageFragment mayaInboxPageFragment3 = (MayaInboxPageFragment) ((s8.c) bVar.c.get());
        mayaInboxPageFragment3.getClass();
        e eVar = mayaInboxPageFragment3.f12412W;
        if (eVar != null) {
            MayaInboxV2Activity mayaInboxV2Activity = (MayaInboxV2Activity) eVar;
            mayaInboxV2Activity.n1();
            Intent intent = new Intent(mayaInboxV2Activity, (Class<?>) MayaInboxDetailsActivity.class);
            intent.putExtra("message", inboxMessage);
            mayaInboxV2Activity.startActivity(intent);
        }
    }

    public final void E(boolean z4, boolean z5) {
        C0440b1 c0440b1 = this.c;
        ImageView inboxItemGreenDotImage = c0440b1.f;
        j.f(inboxItemGreenDotImage, "inboxItemGreenDotImage");
        inboxItemGreenDotImage.setVisibility(8);
        ConstraintLayout constraintLayout = c0440b1.c;
        Context context = this.f20277a;
        constraintLayout.setBackground(z4 ? ContextCompat.getDrawable(context, R.drawable.maya_bg_inbox_read_first) : z5 ? ContextCompat.getDrawable(context, R.drawable.maya_bg_inbox_read_last) : ContextCompat.getDrawable(context, R.drawable.maya_bg_inbox_read));
    }
}
