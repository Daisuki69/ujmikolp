package M5;

import We.s;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3085b;

    public /* synthetic */ d(String str, int i) {
        this.f3084a = i;
        this.f3085b = str;
    }

    @Override // M5.f
    public String d() {
        String str = this.f3085b;
        switch (this.f3084a) {
            case 0:
                return String.format("SELECT * FROM %1$s WHERE %2$s = \"%3$s\"", Arrays.copyOf(new Object[]{"financial_document", SessionDescription.ATTR_TYPE, str}, 3));
            default:
                return String.format("SELECT * FROM %1$s WHERE %2$s = \"%3$s\" LIMIT 1", Arrays.copyOf(new Object[]{"shop_provider", AppMeasurementSdk.ConditionalUserProperty.NAME, str}, 3));
        }
    }

    public String toString() {
        switch (this.f3084a) {
            case 2:
                return s.p(new StringBuilder("Phase('"), this.f3085b, "')");
            default:
                return super.toString();
        }
    }

    public d(String name) {
        this.f3084a = 1;
        j.g(name, "name");
        this.f3085b = name;
    }
}
