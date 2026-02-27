package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.view.e;
import java.util.HashMap;
import pg.C2037D;
import pg.C2042e;
import pg.InterfaceC2040c;
import pg.InterfaceC2041d;

/* JADX INFO: loaded from: classes4.dex */
public class AccessibilityChannel {
    private static final String TAG = "AccessibilityChannel";

    @NonNull
    public final C2042e channel;

    @NonNull
    public final FlutterJNI flutterJNI;

    @Nullable
    private AccessibilityMessageHandler handler;
    public final InterfaceC2040c parsingMessageHandler;

    public interface AccessibilityMessageHandler extends FlutterJNI.AccessibilityDelegate {
        void announce(@NonNull String str);

        void onFocus(int i);

        void onLongPress(int i);

        void onTap(int i);

        void onTooltip(@NonNull String str);
    }

    public AccessibilityChannel(@NonNull DartExecutor dartExecutor, @NonNull FlutterJNI flutterJNI) {
        InterfaceC2040c interfaceC2040c = new InterfaceC2040c() { // from class: io.flutter.embedding.engine.systemchannels.AccessibilityChannel.1
            @Override // pg.InterfaceC2040c
            public void onMessage(@Nullable Object obj, @NonNull InterfaceC2041d interfaceC2041d) {
                HashMap map;
                HashMap map2;
                if (AccessibilityChannel.this.handler == null) {
                    interfaceC2041d.reply(null);
                    return;
                }
                map = (HashMap) obj;
                String str = (String) map.get(SessionDescription.ATTR_TYPE);
                map2 = (HashMap) map.get("data");
                str.getClass();
                switch (str) {
                    case "tooltip":
                        String str2 = (String) map2.get("message");
                        if (str2 != null) {
                            AccessibilityChannel.this.handler.onTooltip(str2);
                            break;
                        }
                        break;
                    case "announce":
                        String str3 = (String) map2.get("message");
                        if (str3 != null) {
                            AccessibilityChannel.this.handler.announce(str3);
                            break;
                        }
                        break;
                    case "tap":
                        Integer num = (Integer) map.get("nodeId");
                        if (num != null) {
                            AccessibilityChannel.this.handler.onTap(num.intValue());
                            break;
                        }
                        break;
                    case "focus":
                        Integer num2 = (Integer) map.get("nodeId");
                        if (num2 != null) {
                            AccessibilityChannel.this.handler.onFocus(num2.intValue());
                            break;
                        }
                        break;
                    case "longPress":
                        Integer num3 = (Integer) map.get("nodeId");
                        if (num3 != null) {
                            AccessibilityChannel.this.handler.onLongPress(num3.intValue());
                            break;
                        }
                        break;
                }
                interfaceC2041d.reply(null);
            }
        };
        this.parsingMessageHandler = interfaceC2040c;
        C2042e c2042e = new C2042e(dartExecutor, "flutter/accessibility", C2037D.INSTANCE, null);
        this.channel = c2042e;
        c2042e.b(interfaceC2040c);
        this.flutterJNI = flutterJNI;
    }

    public void dispatchSemanticsAction(int i, @NonNull e eVar) {
        this.flutterJNI.dispatchSemanticsAction(i, eVar);
    }

    public void onAndroidAccessibilityDisabled() {
        this.flutterJNI.setSemanticsEnabled(false);
    }

    public void onAndroidAccessibilityEnabled() {
        this.flutterJNI.setSemanticsEnabled(true);
    }

    public void setAccessibilityFeatures(int i) {
        this.flutterJNI.setAccessibilityFeatures(i);
    }

    public void setAccessibilityMessageHandler(@Nullable AccessibilityMessageHandler accessibilityMessageHandler) {
        this.handler = accessibilityMessageHandler;
        this.flutterJNI.setAccessibilityDelegate(accessibilityMessageHandler);
    }

    public void dispatchSemanticsAction(int i, @NonNull e eVar, @Nullable Object obj) {
        this.flutterJNI.dispatchSemanticsAction(i, eVar, obj);
    }

    @VisibleForTesting
    public AccessibilityChannel(@NonNull C2042e c2042e, @NonNull FlutterJNI flutterJNI) {
        this.parsingMessageHandler = new InterfaceC2040c() { // from class: io.flutter.embedding.engine.systemchannels.AccessibilityChannel.1
            @Override // pg.InterfaceC2040c
            public void onMessage(@Nullable Object obj, @NonNull InterfaceC2041d interfaceC2041d) {
                HashMap map;
                HashMap map2;
                if (AccessibilityChannel.this.handler == null) {
                    interfaceC2041d.reply(null);
                    return;
                }
                map = (HashMap) obj;
                String str = (String) map.get(SessionDescription.ATTR_TYPE);
                map2 = (HashMap) map.get("data");
                str.getClass();
                switch (str) {
                    case "tooltip":
                        String str2 = (String) map2.get("message");
                        if (str2 != null) {
                            AccessibilityChannel.this.handler.onTooltip(str2);
                            break;
                        }
                        break;
                    case "announce":
                        String str3 = (String) map2.get("message");
                        if (str3 != null) {
                            AccessibilityChannel.this.handler.announce(str3);
                            break;
                        }
                        break;
                    case "tap":
                        Integer num = (Integer) map.get("nodeId");
                        if (num != null) {
                            AccessibilityChannel.this.handler.onTap(num.intValue());
                            break;
                        }
                        break;
                    case "focus":
                        Integer num2 = (Integer) map.get("nodeId");
                        if (num2 != null) {
                            AccessibilityChannel.this.handler.onFocus(num2.intValue());
                            break;
                        }
                        break;
                    case "longPress":
                        Integer num3 = (Integer) map.get("nodeId");
                        if (num3 != null) {
                            AccessibilityChannel.this.handler.onLongPress(num3.intValue());
                            break;
                        }
                        break;
                }
                interfaceC2041d.reply(null);
            }
        };
        this.channel = c2042e;
        this.flutterJNI = flutterJNI;
    }
}
