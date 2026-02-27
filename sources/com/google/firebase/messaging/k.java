package com.google.firebase.messaging;

import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f9790b;

    public /* synthetic */ k(FirebaseMessaging firebaseMessaging, int i) {
        this.f9789a = i;
        this.f9790b = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        boolean z4;
        switch (this.f9789a) {
            case 0:
                y yVar = (y) obj;
                if (!this.f9790b.e.e() || yVar.h.a() == null) {
                    return;
                }
                synchronized (yVar) {
                    z4 = yVar.f9823g;
                }
                if (z4) {
                    return;
                }
                yVar.h(0L);
                return;
            default:
                CloudMessage cloudMessage = (CloudMessage) obj;
                t tVar = FirebaseMessaging.f9758k;
                FirebaseMessaging firebaseMessaging = this.f9790b;
                firebaseMessaging.getClass();
                if (cloudMessage != null) {
                    x3.d.v(cloudMessage.getIntent());
                    ((Rpc) firebaseMessaging.c.c).getProxiedNotificationData().addOnSuccessListener(firebaseMessaging.f, new k(firebaseMessaging, 1));
                    return;
                }
                return;
        }
    }
}
