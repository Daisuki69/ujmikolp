package m4;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f18357a;

    public g(h hVar) {
        this.f18357a = hVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f18357a.c();
    }
}
