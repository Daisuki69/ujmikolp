package Z;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.paymaya.R;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends k {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Button f6864p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Button f6865q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Button f6866r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f6867s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f6868t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f6869u;

    public w(View view) {
        super(view);
        view.setTag(this);
        this.f6869u = (TextView) view.findViewById(R.id.messageTitle);
        this.f6867s = (TextView) view.findViewById(R.id.messageText);
        this.f6868t = (TextView) view.findViewById(R.id.timestamp);
        this.f6864p = (Button) view.findViewById(R.id.cta_button_1);
        this.f6865q = (Button) view.findViewById(R.id.cta_button_2);
        this.f6866r = (Button) view.findViewById(R.id.cta_button_3);
        this.e = (ImageView) view.findViewById(R.id.media_image);
        this.f6832d = (FrameLayout) view.findViewById(R.id.simple_message_frame_layout);
        this.f = (ImageView) view.findViewById(R.id.square_media_image);
        this.i = (RelativeLayout) view.findViewById(R.id.click_relative_layout);
        this.f6831b = (LinearLayout) view.findViewById(R.id.cta_linear_layout);
        this.c = (LinearLayout) view.findViewById(R.id.body_linear_layout);
        this.h = (FrameLayout) view.findViewById(R.id.simple_progress_frame_layout);
        this.f6833g = (RelativeLayout) view.findViewById(R.id.media_layout);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0475 A[Catch: NoClassDefFoundError -> 0x0647, TryCatch #8 {NoClassDefFoundError -> 0x0647, blocks: (B:33:0x0255, B:49:0x0286, B:51:0x0290, B:52:0x0299, B:54:0x029f, B:55:0x02b0, B:57:0x02e8, B:58:0x0304, B:60:0x030a, B:61:0x031b, B:63:0x0357, B:64:0x0377, B:66:0x037d, B:68:0x0387, B:70:0x0396, B:72:0x03a5, B:74:0x03dd, B:71:0x039e, B:75:0x03f9, B:77:0x0408, B:79:0x0417, B:81:0x041f, B:78:0x0410, B:82:0x0438, B:84:0x043e, B:86:0x045c, B:87:0x0475, B:89:0x047f, B:90:0x0488, B:92:0x048e, B:93:0x049f, B:95:0x04d7, B:96:0x04f3, B:98:0x04f9, B:99:0x050a, B:101:0x0546, B:102:0x0566, B:104:0x056c, B:106:0x0576, B:107:0x0587, B:109:0x05bf, B:110:0x05da, B:112:0x05f3, B:113:0x060b, B:115:0x0611, B:117:0x062f, B:38:0x0265, B:41:0x026f), top: B:146:0x0255, inners: #0, #1, #2, #3, #6, #7 }] */
    @Override // Z.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(com.clevertap.android.sdk.inbox.CTInboxMessage r19, com.clevertap.android.sdk.inbox.CTInboxListViewFragment r20, int r21) {
        /*
            Method dump skipped, instruction units count: 1693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.w.E(com.clevertap.android.sdk.inbox.CTInboxMessage, com.clevertap.android.sdk.inbox.CTInboxListViewFragment, int):void");
    }
}
