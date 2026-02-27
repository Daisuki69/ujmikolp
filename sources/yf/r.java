package yf;

import androidx.media3.extractor.ts.TsExtractor;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.HashMap;
import okio.Utf8;

/* JADX INFO: loaded from: classes11.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f21280a = new int[256];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f21281b = new HashMap(256);

    static {
        for (int i = 0; i < 256; i++) {
            if ((i <= 23 || i >= 32) && ((i <= 126 || i >= 161) && i != 173)) {
                a((char) i, i);
            }
        }
        a((char) 728, 24);
        a((char) 711, 25);
        a((char) 710, 26);
        a((char) 729, 27);
        a((char) 733, 28);
        a((char) 731, 29);
        a((char) 730, 30);
        a((char) 732, 31);
        a(Utf8.REPLACEMENT_CHARACTER, 127);
        a((char) 8226, 128);
        a((char) 8224, TsExtractor.TS_STREAM_TYPE_AC3);
        a((char) 8225, 130);
        a((char) 8230, 131);
        a((char) 8212, 132);
        a((char) 8211, 133);
        a((char) 402, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO);
        a((char) 8260, TsExtractor.TS_STREAM_TYPE_E_AC3);
        a((char) 8249, TsExtractor.TS_STREAM_TYPE_DTS_HD);
        a((char) 8250, 137);
        a((char) 8722, TsExtractor.TS_STREAM_TYPE_DTS);
        a((char) 8240, TsExtractor.TS_STREAM_TYPE_DTS_UHD);
        a((char) 8222, 140);
        a((char) 8220, 141);
        a((char) 8221, 142);
        a((char) 8216, 143);
        a((char) 8217, 144);
        a((char) 8218, 145);
        a((char) 8482, 146);
        a((char) 64257, 147);
        a((char) 64258, 148);
        a((char) 321, 149);
        a((char) 338, ServerConfiguration.DEFAULT_MAX_BEACON_SIZE_KB_SAAS);
        a((char) 352, 151);
        a((char) 376, 152);
        a((char) 381, 153);
        a((char) 305, 154);
        a((char) 322, ModuleDescriptor.MODULE_VERSION);
        a((char) 339, 156);
        a((char) 353, 157);
        a((char) 382, 158);
        a(Utf8.REPLACEMENT_CHARACTER, 159);
        a((char) 8364, 160);
    }

    public static void a(char c, int i) {
        f21280a[i] = c;
        f21281b.put(Character.valueOf(c), Integer.valueOf(i));
    }
}
