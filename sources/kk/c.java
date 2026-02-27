package kk;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f18159b;

    public /* synthetic */ c(int i, d dVar) {
        this.f18158a = i;
        this.f18159b = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f18158a) {
            case 0:
                this.f18159b.a();
                break;
            case 1:
                this.f18159b.cancel();
                break;
            case 2:
                this.f18159b.b();
                break;
            default:
                this.f18159b.cancel();
                break;
        }
    }
}
