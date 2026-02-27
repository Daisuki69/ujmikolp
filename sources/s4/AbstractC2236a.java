package s4;

import com.google.android.material.appbar.AppBarLayout;
import t4.d;

/* JADX INFO: renamed from: s4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2236a implements AppBarLayout.OnOffsetChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20003a;

    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        if (i == 0) {
            if (this.f20003a != 1) {
                ((d) this).f20158b.f10189p0 = 1;
            }
            this.f20003a = 1;
        } else if (Math.abs(i) >= appBarLayout.getTotalScrollRange()) {
            if (this.f20003a != 2) {
                ((d) this).f20158b.f10189p0 = 2;
            }
            this.f20003a = 2;
        } else {
            if (this.f20003a != 3) {
                ((d) this).f20158b.f10189p0 = 3;
            }
            this.f20003a = 3;
        }
    }
}
