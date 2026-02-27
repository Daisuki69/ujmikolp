package Lf;

import android.util.Log;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import defpackage.AbstractC1414e;
import java.io.IOException;
import yf.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements Df.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yf.d f2981a;

    public a(yf.d dVar) {
        this.f2981a = dVar;
        j jVar = j.f21262x1;
        yf.b bVarQ = dVar.q(jVar);
        if (bVarQ == null) {
            dVar.F(jVar, j.j);
        } else {
            if (j.j.equals(bVarQ)) {
                return;
            }
            Log.w("PdfBox-Android", "Annotation has type " + bVarQ + ", further mayhem may follow");
        }
    }

    public static a a(yf.d dVar) throws IOException {
        if (!AbstractC1414e.u(dVar)) {
            throw new IOException("Error: Unknown annotation type " + dVar);
        }
        j jVar = j.f21252t1;
        String strZ = dVar.z(jVar);
        if ("FileAttachment".equals(strZ)) {
            return new b(dVar);
        }
        if ("Line".equals(strZ)) {
            return new b(dVar);
        }
        if (i.f16163L.equals(strZ)) {
            return new c(dVar);
        }
        if ("Popup".equals(strZ)) {
            return new c(dVar);
        }
        if ("Stamp".equals(strZ)) {
            return new b(dVar);
        }
        if (e.f16142l.equals(strZ) || e.f.equals(strZ)) {
            return new b(dVar);
        }
        if ("Text".equals(strZ)) {
            return new b(dVar);
        }
        if ("Highlight".equals(strZ) || com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f16073G0.equals(strZ) || "Squiggly".equals(strZ) || "StrikeOut".equals(strZ)) {
            return new b(dVar);
        }
        if ("Widget".equals(strZ)) {
            c cVar = new c(dVar);
            dVar.G(jVar, "Widget");
            return cVar;
        }
        if ("FreeText".equals(strZ) || "Polygon".equals(strZ) || "PolyLine".equals(strZ) || "Caret".equals(strZ) || "Ink".equals(strZ) || "Sound".equals(strZ)) {
            return new c(dVar);
        }
        d dVar2 = new d(dVar);
        Log.d("PdfBox-Android", "Unknown or unsupported annotation subtype " + strZ);
        return dVar2;
    }

    @Override // Df.c
    public final yf.b c() {
        return this.f2981a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            return ((a) obj).f2981a.equals(this.f2981a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2981a.hashCode();
    }
}
