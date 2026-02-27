package Q0;

import P0.f;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.shockwave.pdfium.PdfDocument;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f5197a;

    @Override // Q0.b
    public final void a(S0.a aVar) {
        PdfDocument.Link link = aVar.f5592a;
        String str = link.c;
        Integer num = link.f15510b;
        f fVar = this.f5197a;
        if (str == null || str.isEmpty()) {
            if (num != null) {
                fVar.k(num.intValue());
            }
        } else {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            Context context = fVar.getContext();
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent);
            } else {
                Log.w(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "No activity found for URI: ".concat(str));
            }
        }
    }
}
