package com.tencent.could.huiyansdk.manager;

import android.os.Message;
import android.util.SparseArray;
import com.tencent.could.huiyansdk.R;
import com.tencent.could.huiyansdk.api.j;
import com.tencent.could.huiyansdk.entity.TuringResultCacheEntity;
import com.tencent.could.huiyansdk.enums.AuthState;
import com.tencent.could.huiyansdk.enums.HuiYanAuthEvent;
import com.tencent.could.huiyansdk.enums.HuiYanAuthTipsEvent;
import com.tencent.could.huiyansdk.manager.e;
import com.tencent.could.huiyansdk.turing.f;
import ha.u;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.tencent.could.huiyansdk.callback.a f15664b;
    public com.tencent.could.huiyansdk.callback.b c;
    public int[] e;
    public int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f15666g;
    public int[] h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f15668l;
    public SparseArray<HuiYanAuthTipsEvent> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HuiYanAuthTipsEvent f15669n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15670o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15671p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15672q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15673r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AuthState f15663a = AuthState.PREPARE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15665d = false;
    public int i = -1;
    public int j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15667k = 3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile boolean f15674s = false;

    public class a implements com.tencent.could.huiyansdk.callback.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f15675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f15676b;
        public final /* synthetic */ String c;

        public a(boolean z4, String str, String str2) {
            this.f15675a = z4;
            this.f15676b = str;
            this.c = str2;
        }

        public void a() {
            e.a.f15688a.a(2, "AuthStateManager", "start compare.");
            b.this.a(AuthState.AUTH_END, (Object) null);
            j jVar = j.a.f15618a;
            jVar.a(HuiYanAuthEvent.LOCAL_DETECTION_DONE, true);
            if (this.f15675a) {
                jVar.a(this.f15676b, this.c);
            } else {
                jVar.a(this.f15676b, "");
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.b$b, reason: collision with other inner class name */
    public static final class C0084b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f15678a = new b();
    }

    public b() {
        int i = R.string.fl_no_face;
        int i4 = R.string.fl_incomplete_face;
        int i6 = R.string.fl_pose_incorrect;
        int i10 = R.string.fl_no_left_face;
        int i11 = R.string.fl_no_right_face;
        int i12 = R.string.fl_no_chin;
        int i13 = R.string.fl_no_mouth;
        int i14 = R.string.fl_no_nose;
        int i15 = R.string.fl_no_left_eye;
        int i16 = R.string.fl_no_right_eye;
        int i17 = R.string.fl_pose_closer;
        int i18 = R.string.fl_pose_farer;
        int i19 = R.string.fl_too_many_faces;
        int i20 = R.string.fl_pose_open_eye;
        this.e = new int[]{i, i4, i6, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, R.string.fl_close_mouth, i20, R.string.msg_fsm_pause};
        this.f = new int[]{R.string.fl_act_blink, R.string.fl_act_open_mouth, R.string.fl_act_shake_head, R.string.fl_act_nod_head, R.string.fl_pose_keep};
        this.f15666g = new int[]{R.string.fl_act_screen_shaking};
        this.h = new int[]{R.string.rst_succeed, R.string.rst_failed, R.string.net_fetch_data, R.string.net_fetch_failed, R.string.net_reporting, R.string.msg_net_error, R.string.msg_param_error, R.string.msg_inner_error, R.string.msg_user_cancel, R.string.msg_cam_error, R.string.msg_light_dark, R.string.msg_light_norm, R.string.msg_light_bright};
        a();
    }

    public void a(String str) {
        e.a.f15688a.a(2, "AuthStateManager", "do live compare result");
        f fVar = this.f15668l;
        if (fVar == null) {
            b(str, true, "");
        } else {
            fVar.c(new u(9, this, str));
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(String str, boolean z4, String str2) {
        com.tencent.could.huiyansdk.turing.f fVar = f.a.f15724a;
        a aVar = new a(z4, str, str2);
        TuringResultCacheEntity turingResultCacheEntity = fVar.f;
        if (!(turingResultCacheEntity != null ? turingResultCacheEntity.isNeedFrameCheck() : false)) {
            aVar.a();
            return;
        }
        if (fVar.e) {
            aVar.a();
            return;
        }
        fVar.i = aVar;
        if (fVar.m != null) {
            Message messageObtainMessage = fVar.m.obtainMessage();
            messageObtainMessage.what = 4;
            fVar.m.sendMessageDelayed(messageObtainMessage, fVar.f15717a);
            return;
        }
        e.a.f15688a.a(2, "TuringSdkHelper", "waiting handler is null!");
    }

    public final void a() {
        if (this.m == null) {
            SparseArray<HuiYanAuthTipsEvent> sparseArray = new SparseArray<>(20);
            this.m = sparseArray;
            sparseArray.put(R.string.fl_act_open_mouth, HuiYanAuthTipsEvent.ACT_OPEN_MOUTH);
            this.m.put(R.string.fl_act_blink, HuiYanAuthTipsEvent.ACT_BLINK);
            this.m.put(R.string.fl_act_nod_head, HuiYanAuthTipsEvent.ACT_NOD_HEAD);
            this.m.put(R.string.fl_act_shake_head, HuiYanAuthTipsEvent.ACT_SHAKE_HEAD);
            this.m.put(R.string.fl_act_screen_shaking, HuiYanAuthTipsEvent.ACT_SCREEN_SHAKING);
            this.m.put(R.string.fl_no_face, HuiYanAuthTipsEvent.NO_FACE);
            this.m.put(R.string.fl_no_left_face, HuiYanAuthTipsEvent.NO_LEFT_FACE);
            this.m.put(R.string.fl_no_right_face, HuiYanAuthTipsEvent.NO_RIGHT_FACE);
            this.m.put(R.string.fl_no_chin, HuiYanAuthTipsEvent.NO_CHIN);
            this.m.put(R.string.fl_no_mouth, HuiYanAuthTipsEvent.NO_MOUTH);
            this.m.put(R.string.fl_no_nose, HuiYanAuthTipsEvent.NO_NOSE);
            this.m.put(R.string.fl_no_left_eye, HuiYanAuthTipsEvent.NO_LEFT_EYE);
            this.m.put(R.string.fl_no_right_eye, HuiYanAuthTipsEvent.NO_RIGHT_EYE);
            this.m.put(R.string.fl_pose_keep, HuiYanAuthTipsEvent.POSE_KEEP);
            this.m.put(R.string.fl_incomplete_face, HuiYanAuthTipsEvent.INCOMPLETE_FACE);
            this.m.put(R.string.fl_pose_closer, HuiYanAuthTipsEvent.POSE_CLOSER);
            this.m.put(R.string.fl_pose_farer, HuiYanAuthTipsEvent.POSE_FARTHER);
            this.m.put(R.string.fl_pose_incorrect, HuiYanAuthTipsEvent.POSE_INCORRECT);
            this.m.put(R.string.fl_too_many_faces, HuiYanAuthTipsEvent.TOO_MANY_FACE);
            this.m.put(R.string.fl_pose_open_eye, HuiYanAuthTipsEvent.POSE_OPEN_EYE);
        }
        this.f15669n = HuiYanAuthTipsEvent.NONE;
    }

    public void a(AuthState authState, Object obj) {
        this.f15663a = authState;
        com.tencent.could.huiyansdk.callback.a aVar = this.f15664b;
        if (aVar != null) {
            aVar.a(authState, obj);
        }
    }

    public final void a(int i) {
        com.tencent.could.huiyansdk.callback.b bVar = this.c;
        if (bVar != null) {
            ((com.tencent.could.huiyansdk.fragments.f) bVar).b(i);
        }
    }

    public final boolean a(int i, int[] iArr) {
        for (int i4 : iArr) {
            if (i == i4) {
                return true;
            }
        }
        return false;
    }
}
