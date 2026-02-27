package com.paymaya.domain.store;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.paymaya.domain.model.PushToken;

/* JADX INFO: renamed from: com.paymaya.domain.store.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1291w0 implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1293x0 f11493a;

    public C1291w0(C1293x0 c1293x0) {
        this.f11493a = c1293x0;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        if (task.isSuccessful()) {
            this.f11493a.c.registerPushToken(PushToken.sBuilder().mToken((String) task.getResult()).build()).c();
        }
    }
}
