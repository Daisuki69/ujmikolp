package io.flutter.embedding.engine.systemchannels;

import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import pg.C2042e;
import pg.InterfaceC2041d;
import pg.j;
import pg.o;

/* JADX INFO: loaded from: classes4.dex */
public class KeyEventChannel {
    private static final String TAG = "KeyEventChannel";

    @NonNull
    public final C2042e channel;

    public interface EventResponseHandler {
        void onFrameworkResponse(boolean z4);
    }

    public static class FlutterKeyEvent {

        @Nullable
        public final Character complexCharacter;
        public final KeyEvent event;

        public FlutterKeyEvent(@NonNull KeyEvent keyEvent) {
            this(keyEvent, null);
        }

        public FlutterKeyEvent(@NonNull KeyEvent keyEvent, @Nullable Character ch2) {
            this.event = keyEvent;
            this.complexCharacter = ch2;
        }
    }

    public KeyEventChannel(@NonNull j jVar) {
        this.channel = new C2042e(jVar, "flutter/keyevent", o.f19110a, null);
    }

    private static InterfaceC2041d createReplyHandler(@NonNull EventResponseHandler eventResponseHandler) {
        return new b(eventResponseHandler);
    }

    private Map<String, Object> encodeKeyEvent(@NonNull FlutterKeyEvent flutterKeyEvent, boolean z4) {
        HashMap map = new HashMap();
        map.put(SessionDescription.ATTR_TYPE, z4 ? "keyup" : "keydown");
        map.put("keymap", "android");
        map.put("flags", Integer.valueOf(flutterKeyEvent.event.getFlags()));
        map.put("plainCodePoint", Integer.valueOf(flutterKeyEvent.event.getUnicodeChar(0)));
        map.put("codePoint", Integer.valueOf(flutterKeyEvent.event.getUnicodeChar()));
        map.put("keyCode", Integer.valueOf(flutterKeyEvent.event.getKeyCode()));
        map.put("scanCode", Integer.valueOf(flutterKeyEvent.event.getScanCode()));
        map.put("metaState", Integer.valueOf(flutterKeyEvent.event.getMetaState()));
        Character ch2 = flutterKeyEvent.complexCharacter;
        if (ch2 != null) {
            map.put("character", ch2.toString());
        }
        map.put("source", Integer.valueOf(flutterKeyEvent.event.getSource()));
        map.put("deviceId", Integer.valueOf(flutterKeyEvent.event.getDeviceId()));
        map.put("repeatCount", Integer.valueOf(flutterKeyEvent.event.getRepeatCount()));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$createReplyHandler$0(EventResponseHandler eventResponseHandler, Object obj) {
        boolean z4 = false;
        if (obj != null) {
            try {
                z4 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e) {
                Log.e(TAG, "Unable to unpack JSON message: " + e);
            }
        }
        eventResponseHandler.onFrameworkResponse(z4);
    }

    public void sendFlutterKeyEvent(@NonNull FlutterKeyEvent flutterKeyEvent, boolean z4, @NonNull EventResponseHandler eventResponseHandler) {
        this.channel.a(encodeKeyEvent(flutterKeyEvent, z4), createReplyHandler(eventResponseHandler));
    }
}
