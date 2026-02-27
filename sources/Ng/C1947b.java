package ng;

import P0.f;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.shockwave.pdfium.PdfDocument;
import dOYHB6.tiZVw8.numX49;
import pg.u;

/* JADX INFO: renamed from: ng.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1947b implements Q0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f18731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f18732b;
    public u c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18733d;

    @Override // Q0.b
    public final void a(S0.a aVar) {
        PdfDocument.Link link = aVar.f5592a;
        String str = link.c;
        Integer num = link.f15510b;
        if (str == null || str.isEmpty()) {
            if (num != null) {
                this.f18731a.k(num.intValue());
                return;
            }
            return;
        }
        if (!this.f18733d) {
            Uri uri = Uri.parse(str);
            Intent intent = new Intent(numX49.tnTj78("bQ9M"));
            intent.setData(uri);
            intent.addFlags(268435456);
            intent.addFlags(32768);
            Context context = this.f18732b;
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent, null);
            }
        }
        this.c.a(numX49.tnTj78("bQ9N"), str, null);
    }
}
