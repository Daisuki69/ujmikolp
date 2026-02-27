package w1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f20652b;
    public final /* synthetic */ z c;

    public /* synthetic */ y(z zVar, t tVar, int i) {
        this.f20651a = i;
        this.c = zVar;
        this.f20652b = tVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20651a) {
            case 0:
                z zVar = this.c;
                zVar.j(1);
                if (zVar.f20654B) {
                    this.f20652b.post(zVar.f20667s);
                    zVar.f20654B = false;
                }
                break;
            case 1:
                z zVar2 = this.c;
                zVar2.j(2);
                if (zVar2.f20654B) {
                    this.f20652b.post(zVar2.f20667s);
                    zVar2.f20654B = false;
                }
                break;
            default:
                z zVar3 = this.c;
                zVar3.j(2);
                if (zVar3.f20654B) {
                    this.f20652b.post(zVar3.f20667s);
                    zVar3.f20654B = false;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f20651a) {
            case 0:
                this.c.j(3);
                break;
            case 1:
                this.c.j(3);
                break;
            default:
                this.c.j(3);
                break;
        }
    }
}
