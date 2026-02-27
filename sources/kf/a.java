package Kf;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.b;
import yf.d;
import yf.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2654b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, int i) {
        super(dVar);
        this.f2654b = i;
        switch (i) {
            case 1:
                super(dVar);
                yf.b bVarW = dVar.w(j.f21262x1);
                j jVar = j.R0;
                if (bVarW.equals(jVar)) {
                    return;
                }
                throw new IllegalArgumentException("Provided dictionary is not of type '" + jVar + "'");
            default:
                yf.b bVarW2 = dVar.w(j.f21262x1);
                j jVar2 = j.f21190Q0;
                if (bVarW2.equals(jVar2)) {
                    return;
                }
                throw new IllegalArgumentException("Provided dictionary is not of type '" + jVar2 + "'");
        }
    }

    public String toString() {
        switch (this.f2654b) {
            case 0:
                return super.toString() + " (" + this.f16058a.B(j.f21185M0) + ")";
            default:
                return super.toString();
        }
    }
}
