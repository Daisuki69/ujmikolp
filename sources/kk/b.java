package kk;

import Rg.u;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import m4.h;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18157b;

    public /* synthetic */ b(Object obj, int i) {
        this.f18156a = i;
        this.f18157b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f18156a) {
            case 0:
                ((FragmentActivity) ((u) this.f18157b).f5552b).finish();
                break;
            case 1:
                ((FragmentActivity) ((u) this.f18157b).f5552b).finish();
                break;
            case 2:
                ((FragmentActivity) ((u) this.f18157b).f5552b).finish();
                break;
            default:
                ((h) this.f18157b).c();
                break;
        }
    }
}
