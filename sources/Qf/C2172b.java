package qf;

import com.tencent.could.huiyansdk.enums.AuthState;
import com.tencent.could.huiyansdk.fragments.AuthingFragment;
import com.tencent.could.huiyansdk.manager.d;

/* JADX INFO: renamed from: qf.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2172b implements d.c, com.tencent.could.huiyansdk.callback.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AuthingFragment f19775a;

    public /* synthetic */ C2172b(AuthingFragment authingFragment) {
        this.f19775a = authingFragment;
    }

    @Override // com.tencent.could.huiyansdk.manager.d.c
    public void a(float f) {
        this.f19775a.a(f);
    }

    @Override // com.tencent.could.huiyansdk.callback.a
    public void a(AuthState authState, Object obj) {
        this.f19775a.a(authState, obj);
    }
}
