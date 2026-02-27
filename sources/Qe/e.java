package Qe;

import android.media.AudioDeviceInfo;
import android.media.MicrophoneInfo;
import android.os.Build;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import pg.s;
import pg.u;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static d f5363b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f5364a;

    public static ArrayList a(MicrophoneInfo.Coordinate3F coordinate3F) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Double.valueOf(coordinate3F.x));
        arrayList.add(Double.valueOf(coordinate3F.y));
        arrayList.add(Double.valueOf(coordinate3F.z));
        return arrayList;
    }

    public static HashMap b(AudioDeviceInfo audioDeviceInfo) {
        return d(TtmlNode.ATTR_ID, Integer.valueOf(audioDeviceInfo.getId()), "productName", audioDeviceInfo.getProductName(), "address", Build.VERSION.SDK_INT >= 28 ? audioDeviceInfo.getAddress() : null, "isSource", Boolean.valueOf(audioDeviceInfo.isSource()), "isSink", Boolean.valueOf(audioDeviceInfo.isSink()), "sampleRates", audioDeviceInfo.getSampleRates(), "channelMasks", audioDeviceInfo.getChannelMasks(), "channelIndexMasks", audioDeviceInfo.getChannelIndexMasks(), "channelCounts", audioDeviceInfo.getChannelCounts(), "encodings", audioDeviceInfo.getEncodings(), SessionDescription.ATTR_TYPE, Integer.valueOf(audioDeviceInfo.getType()));
    }

    public static ArrayList c(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static HashMap d(Object... objArr) {
        HashMap map = new HashMap();
        for (int i = 0; i < objArr.length; i += 2) {
            map.put((String) objArr[i], objArr[i + 1]);
        }
        return map;
    }

    public static void e(int i) {
        if (Build.VERSION.SDK_INT < i) {
            throw new RuntimeException(We.s.f(i, "Requires API level "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x020e  */
    @Override // pg.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMethodCall(pg.r r12, pg.t r13) {
        /*
            Method dump skipped, instruction units count: 1828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qe.e.onMethodCall(pg.r, pg.t):void");
    }
}
