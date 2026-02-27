package Qe;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MicrophoneInfo;
import android.os.Build;
import android.util.Pair;
import android.view.KeyEvent;
import androidx.core.content.ContextCompat;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioFocusRequestCompat;
import androidx.media.AudioManagerCompat;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import dOYHB6.yFtIp6.ht2aO8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f5359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AudioFocusRequestCompat f5360b;
    public c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f5361d;
    public Context e;
    public AudioManager f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f5362g;
    public List h;

    public final boolean a() {
        Context context;
        Context context2 = this.e;
        if (context2 == null) {
            return false;
        }
        c cVar = this.c;
        if (cVar != null) {
            ht2aO8.unregisterReceiver(context2, cVar);
            this.c = null;
        }
        c cVar2 = this.f5361d;
        if (cVar2 != null && (context = this.e) != null) {
            ht2aO8.unregisterReceiver(context, cVar2);
            this.f5361d = null;
        }
        AudioFocusRequestCompat audioFocusRequestCompat = this.f5360b;
        if (audioFocusRequestCompat != null) {
            int iAbandonAudioFocusRequest = AudioManagerCompat.abandonAudioFocusRequest(this.f, audioFocusRequestCompat);
            this.f5360b = null;
            if (iAbandonAudioFocusRequest != 1) {
                return false;
            }
        }
        return true;
    }

    public final void b(Map map) {
        Object obj = map.get("downTime");
        long jLongValue = ((obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(((Integer) obj).intValue())).longValue();
        Object obj2 = map.get("eventTime");
        this.f.dispatchMediaKeyEvent(new KeyEvent(jLongValue, ((obj2 == null || (obj2 instanceof Long)) ? (Long) obj2 : Long.valueOf(((Integer) obj2).intValue())).longValue(), ((Integer) map.get("action")).intValue(), ((Integer) map.get("keyCode")).intValue(), ((Integer) map.get("repeatCount")).intValue(), ((Integer) map.get("metaState")).intValue(), ((Integer) map.get("deviceId")).intValue(), ((Integer) map.get("scanCode")).intValue(), ((Integer) map.get("flags")).intValue(), ((Integer) map.get("source")).intValue()));
    }

    public final ArrayList c(int i) {
        e.e(23);
        ArrayList arrayList = new ArrayList();
        for (AudioDeviceInfo audioDeviceInfo : this.f.getDevices(i)) {
            arrayList.add(e.d(TtmlNode.ATTR_ID, Integer.valueOf(audioDeviceInfo.getId()), "productName", audioDeviceInfo.getProductName(), "address", Build.VERSION.SDK_INT >= 28 ? audioDeviceInfo.getAddress() : null, "isSource", Boolean.valueOf(audioDeviceInfo.isSource()), "isSink", Boolean.valueOf(audioDeviceInfo.isSink()), "sampleRates", e.c(audioDeviceInfo.getSampleRates()), "channelMasks", e.c(audioDeviceInfo.getChannelMasks()), "channelIndexMasks", e.c(audioDeviceInfo.getChannelIndexMasks()), "channelCounts", e.c(audioDeviceInfo.getChannelCounts()), "encodings", e.c(audioDeviceInfo.getEncodings()), SessionDescription.ATTR_TYPE, Integer.valueOf(audioDeviceInfo.getType())));
        }
        return arrayList;
    }

    public final ArrayList d() {
        char c = 1;
        e.e(28);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f.getMicrophones().iterator();
        while (it.hasNext()) {
            MicrophoneInfo microphoneInfoH = B0.a.h(it.next());
            ArrayList arrayList2 = new ArrayList();
            for (Pair pair : microphoneInfoH.getFrequencyResponse()) {
                Double dValueOf = Double.valueOf(((Float) pair.first).floatValue());
                Double dValueOf2 = Double.valueOf(((Float) pair.second).floatValue());
                Double[] dArr = new Double[2];
                dArr[0] = dValueOf;
                dArr[c] = dValueOf2;
                arrayList2.add(new ArrayList(Arrays.asList(dArr)));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Pair pair2 : microphoneInfoH.getChannelMapping()) {
                Integer num = (Integer) pair2.first;
                Integer num2 = (Integer) pair2.second;
                Integer[] numArr = new Integer[2];
                numArr[0] = num;
                numArr[c] = num2;
                arrayList3.add(new ArrayList(Arrays.asList(numArr)));
            }
            String description = microphoneInfoH.getDescription();
            Integer numValueOf = Integer.valueOf(microphoneInfoH.getId());
            Integer numValueOf2 = Integer.valueOf(microphoneInfoH.getType());
            String address = microphoneInfoH.getAddress();
            Integer numValueOf3 = Integer.valueOf(microphoneInfoH.getLocation());
            Integer numValueOf4 = Integer.valueOf(microphoneInfoH.getGroup());
            Integer numValueOf5 = Integer.valueOf(microphoneInfoH.getIndexInTheGroup());
            ArrayList arrayListA = e.a(microphoneInfoH.getPosition());
            ArrayList arrayListA2 = e.a(microphoneInfoH.getOrientation());
            Float fValueOf = Float.valueOf(microphoneInfoH.getSensitivity());
            Float fValueOf2 = Float.valueOf(microphoneInfoH.getMaxSpl());
            Float fValueOf3 = Float.valueOf(microphoneInfoH.getMinSpl());
            Integer numValueOf6 = Integer.valueOf(microphoneInfoH.getDirectionality());
            char c10 = c;
            Object[] objArr = new Object[30];
            objArr[0] = "description";
            objArr[c10] = description;
            objArr[2] = TtmlNode.ATTR_ID;
            objArr[3] = numValueOf;
            objArr[4] = SessionDescription.ATTR_TYPE;
            objArr[5] = numValueOf2;
            objArr[6] = "address";
            objArr[7] = address;
            objArr[8] = "location";
            objArr[9] = numValueOf3;
            objArr[10] = "group";
            objArr[11] = numValueOf4;
            objArr[12] = "indexInTheGroup";
            objArr[13] = numValueOf5;
            objArr[14] = "position";
            objArr[15] = arrayListA;
            objArr[16] = "orientation";
            objArr[17] = arrayListA2;
            objArr[18] = "frequencyResponse";
            objArr[19] = arrayList2;
            objArr[20] = "channelMapping";
            objArr[21] = arrayList3;
            objArr[22] = "sensitivity";
            objArr[23] = fValueOf;
            objArr[24] = "maxSpl";
            objArr[25] = fValueOf2;
            objArr[26] = "minSpl";
            objArr[27] = fValueOf3;
            objArr[28] = "directionality";
            objArr[29] = numValueOf6;
            arrayList.add(e.d(objArr));
            c = c10;
        }
        return arrayList;
    }

    public final void e(String str, Object... objArr) {
        for (e eVar : this.f5359a) {
            eVar.f5364a.a(str, new ArrayList(Arrays.asList(objArr)), null);
        }
    }

    public final boolean f(List list) {
        if (this.f5360b != null) {
            return true;
        }
        Map map = (Map) list.get(0);
        AudioFocusRequestCompat.Builder builder = new AudioFocusRequestCompat.Builder(((Integer) map.get("gainType")).intValue());
        builder.setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() { // from class: Qe.a
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                d dVar = this.f5355a;
                if (i == -1) {
                    dVar.a();
                }
                dVar.e("onAudioFocusChanged", Integer.valueOf(i));
            }
        });
        if (map.get("audioAttributes") != null) {
            Map map2 = (Map) map.get("audioAttributes");
            AudioAttributesCompat.Builder builder2 = new AudioAttributesCompat.Builder();
            if (map2.get("contentType") != null) {
                builder2.setContentType(((Integer) map2.get("contentType")).intValue());
            }
            if (map2.get("flags") != null) {
                builder2.setFlags(((Integer) map2.get("flags")).intValue());
            }
            if (map2.get("usage") != null) {
                builder2.setUsage(((Integer) map2.get("usage")).intValue());
            }
            builder.setAudioAttributes(builder2.build());
        }
        if (map.get("willPauseWhenDucked") != null) {
            builder.setWillPauseWhenDucked(((Boolean) map.get("willPauseWhenDucked")).booleanValue());
        }
        AudioFocusRequestCompat audioFocusRequestCompatBuild = builder.build();
        this.f5360b = audioFocusRequestCompatBuild;
        boolean z4 = AudioManagerCompat.requestAudioFocus(this.f, audioFocusRequestCompatBuild) == 1;
        if (z4) {
            if (this.c == null) {
                c cVar = new c(this, 0);
                this.c = cVar;
                ContextCompat.registerReceiver(this.e, cVar, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"), 2);
            }
            if (this.f5361d == null) {
                c cVar2 = new c(this, 1);
                this.f5361d = cVar2;
                ContextCompat.registerReceiver(this.e, cVar2, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"), 2);
            }
        }
        return z4;
    }
}
