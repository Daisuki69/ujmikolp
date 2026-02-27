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
public final class g extends k {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RelativeLayout f6817p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Button f6818q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Button f6819r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Button f6820s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinearLayout f6821t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ImageView f6822u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f6823v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f6824w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TextView f6825x;

    public g(View view) {
        super(view);
        view.setTag(this);
        this.f6823v = (TextView) view.findViewById(R.id.messageTitle);
        this.f6824w = (TextView) view.findViewById(R.id.messageText);
        this.e = (ImageView) view.findViewById(R.id.media_image);
        this.f6822u = (ImageView) view.findViewById(R.id.image_icon);
        this.f6825x = (TextView) view.findViewById(R.id.timestamp);
        this.f6818q = (Button) view.findViewById(R.id.cta_button_1);
        this.f6819r = (Button) view.findViewById(R.id.cta_button_2);
        this.f6820s = (Button) view.findViewById(R.id.cta_button_3);
        this.f6832d = (FrameLayout) view.findViewById(R.id.icon_message_frame_layout);
        this.f = (ImageView) view.findViewById(R.id.square_media_image);
        this.f6817p = (RelativeLayout) view.findViewById(R.id.click_relative_layout);
        this.f6821t = (LinearLayout) view.findViewById(R.id.cta_linear_layout);
        this.h = (FrameLayout) view.findViewById(R.id.icon_progress_frame_layout);
        this.f6833g = (RelativeLayout) view.findViewById(R.id.media_layout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04a4 A[Catch: NoClassDefFoundError -> 0x067c, TryCatch #7 {NoClassDefFoundError -> 0x067c, blocks: (B:79:0x03bc, B:81:0x03cb, B:83:0x0406, B:80:0x03c4, B:84:0x041f, B:86:0x042f, B:88:0x043e, B:90:0x044c, B:87:0x0437, B:91:0x0465, B:93:0x046c, B:95:0x048b, B:96:0x04a4, B:98:0x04af, B:99:0x04b8, B:101:0x04be, B:102:0x04d0, B:104:0x0508, B:105:0x0524, B:107:0x052a, B:108:0x053c, B:110:0x0578, B:111:0x0598, B:113:0x059e, B:115:0x05ae, B:116:0x05ba, B:118:0x05f2, B:119:0x060d, B:121:0x0627, B:122:0x063f, B:124:0x0645, B:126:0x0664), top: B:165:0x02a4, inners: #0, #3, #4, #5 }] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // Z.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(com.clevertap.android.sdk.inbox.CTInboxMessage r22, com.clevertap.android.sdk.inbox.CTInboxListViewFragment r23, int r24) {
        /*
            Method dump skipped, instruction units count: 1847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.g.E(com.clevertap.android.sdk.inbox.CTInboxMessage, com.clevertap.android.sdk.inbox.CTInboxListViewFragment, int):void");
    }
}
