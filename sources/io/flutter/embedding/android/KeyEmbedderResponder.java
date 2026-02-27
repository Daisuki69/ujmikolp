package io.flutter.embedding.android;

import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.embedding.android.KeyData;
import io.flutter.embedding.android.KeyboardManager;
import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import pg.g;
import pg.j;

/* JADX INFO: loaded from: classes4.dex */
public class KeyEmbedderResponder implements KeyboardManager.Responder {
    private static final String TAG = "KeyEmbedderResponder";

    @NonNull
    private final j messenger;

    @NonNull
    private final HashMap<Long, Long> pressingRecords = new HashMap<>();

    @NonNull
    private final HashMap<Long, KeyboardMap.TogglingGoal> togglingGoals = new HashMap<>();

    @NonNull
    private final KeyboardManager.CharacterCombiner characterCombiner = new KeyboardManager.CharacterCombiner();

    /* JADX INFO: renamed from: io.flutter.embedding.android.KeyEmbedderResponder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$android$KeyData$Type;

        static {
            int[] iArr = new int[KeyData.Type.values().length];
            $SwitchMap$io$flutter$embedding$android$KeyData$Type = iArr;
            try {
                iArr[KeyData.Type.kDown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$embedding$android$KeyData$Type[KeyData.Type.kUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$embedding$android$KeyData$Type[KeyData.Type.kRepeat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public KeyEmbedderResponder(j jVar) {
        this.messenger = jVar;
        for (KeyboardMap.TogglingGoal togglingGoal : KeyboardMap.getTogglingGoals()) {
            this.togglingGoals.put(Long.valueOf(togglingGoal.logicalKey), togglingGoal);
        }
    }

    private static KeyData.Type getEventType(KeyEvent keyEvent) {
        boolean z4 = keyEvent.getRepeatCount() > 0;
        int action = keyEvent.getAction();
        if (action == 0) {
            return z4 ? KeyData.Type.kRepeat : KeyData.Type.kDown;
        }
        if (action == 1) {
            return KeyData.Type.kUp;
        }
        throw new AssertionError("Unexpected event type");
    }

    private Long getLogicalKey(@NonNull KeyEvent keyEvent) {
        Long l6 = KeyboardMap.keyCodeToLogical.get(Long.valueOf(keyEvent.getKeyCode()));
        return l6 != null ? l6 : Long.valueOf(keyOfPlane(keyEvent.getKeyCode(), KeyboardMap.kAndroidPlane));
    }

    private Long getPhysicalKey(@NonNull KeyEvent keyEvent) {
        long scanCode = keyEvent.getScanCode();
        if (scanCode == 0) {
            return Long.valueOf(keyOfPlane(keyEvent.getKeyCode(), KeyboardMap.kAndroidPlane));
        }
        Long l6 = KeyboardMap.scanCodeToPhysical.get(Long.valueOf(scanCode));
        return l6 != null ? l6 : Long.valueOf(keyOfPlane(keyEvent.getScanCode(), KeyboardMap.kAndroidPlane));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013e A[LOOP:2: B:70:0x0138->B:72:0x013e, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean handleEventImpl(@androidx.annotation.NonNull android.view.KeyEvent r16, @androidx.annotation.NonNull io.flutter.embedding.android.KeyboardManager.Responder.OnKeyEventHandledCallback r17) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.KeyEmbedderResponder.handleEventImpl(android.view.KeyEvent, io.flutter.embedding.android.KeyboardManager$Responder$OnKeyEventHandledCallback):boolean");
    }

    private static long keyOfPlane(long j, long j6) {
        return (j & KeyboardMap.kValueMask) | j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$sendKeyEvent$2(KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback, ByteBuffer byteBuffer) {
        Boolean boolValueOf = Boolean.FALSE;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            if (byteBuffer.capacity() != 0) {
                boolValueOf = Boolean.valueOf(byteBuffer.get() != 0);
            }
        } else {
            Log.w(TAG, "A null reply was received when sending a key event to the framework.");
        }
        onKeyEventHandledCallback.onKeyEventHandled(boolValueOf.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$synchronizePressingKey$0(KeyboardMap.KeyPair keyPair, long j, KeyEvent keyEvent) {
        synthesizeEvent(false, Long.valueOf(keyPair.logicalKey), Long.valueOf(j), keyEvent.getEventTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$synchronizePressingKey$1(KeyboardMap.KeyPair keyPair, KeyEvent keyEvent) {
        synthesizeEvent(false, Long.valueOf(keyPair.logicalKey), Long.valueOf(keyPair.physicalKey), keyEvent.getEventTime());
    }

    private void sendKeyEvent(KeyData keyData, final KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        this.messenger.send(KeyData.CHANNEL, keyData.toBytes(), onKeyEventHandledCallback == null ? null : new g() { // from class: io.flutter.embedding.android.f
            @Override // pg.g
            public final void reply(ByteBuffer byteBuffer) {
                KeyEmbedderResponder.lambda$sendKeyEvent$2(onKeyEventHandledCallback, byteBuffer);
            }
        });
    }

    private void synthesizeEvent(boolean z4, Long l6, Long l8, long j) {
        KeyData keyData = new KeyData();
        keyData.timestamp = j;
        keyData.type = z4 ? KeyData.Type.kDown : KeyData.Type.kUp;
        keyData.logicalKey = l6.longValue();
        keyData.physicalKey = l8.longValue();
        keyData.character = null;
        keyData.synthesized = true;
        keyData.deviceType = KeyData.DeviceType.kKeyboard;
        if (l8.longValue() != 0 && l6.longValue() != 0) {
            if (!z4) {
                l6 = null;
            }
            updatePressingState(l8, l6);
        }
        sendKeyEvent(keyData, null);
    }

    public Map<Long, Long> getPressedState() {
        return Collections.unmodifiableMap(this.pressingRecords);
    }

    @Override // io.flutter.embedding.android.KeyboardManager.Responder
    public void handleEvent(@NonNull KeyEvent keyEvent, @NonNull KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        if (handleEventImpl(keyEvent, onKeyEventHandledCallback)) {
            return;
        }
        synthesizeEvent(true, 0L, 0L, 0L);
        onKeyEventHandledCallback.onKeyEventHandled(true);
    }

    public void synchronizePressingKey(KeyboardMap.PressingGoal pressingGoal, boolean z4, long j, long j6, KeyEvent keyEvent, ArrayList<Runnable> arrayList) {
        KeyboardMap.KeyPair[] keyPairArr = pressingGoal.keys;
        boolean[] zArr = new boolean[keyPairArr.length];
        Boolean[] boolArr = new Boolean[keyPairArr.length];
        boolean z5 = false;
        int i = 0;
        while (true) {
            KeyboardMap.KeyPair[] keyPairArr2 = pressingGoal.keys;
            boolean z8 = true;
            if (i >= keyPairArr2.length) {
                break;
            }
            KeyboardMap.KeyPair keyPair = keyPairArr2[i];
            boolean zContainsKey = this.pressingRecords.containsKey(Long.valueOf(keyPair.physicalKey));
            zArr[i] = zContainsKey;
            if (keyPair.logicalKey == j) {
                int i4 = AnonymousClass1.$SwitchMap$io$flutter$embedding$android$KeyData$Type[getEventType(keyEvent).ordinal()];
                if (i4 != 1) {
                    if (i4 == 2) {
                        boolArr[i] = Boolean.valueOf(zArr[i]);
                    } else if (i4 == 3) {
                        if (!z4) {
                            arrayList.add(new androidx.work.impl.b(11, this, keyPair, keyEvent));
                        }
                        boolArr[i] = Boolean.valueOf(zArr[i]);
                    }
                    i++;
                } else {
                    boolArr[i] = Boolean.FALSE;
                    if (!z4) {
                        arrayList.add(new Mi.e(this, keyPair, j6, keyEvent));
                    }
                }
            } else if (!z5 && !zContainsKey) {
                z8 = false;
            }
            z5 = z8;
            i++;
        }
        if (z4) {
            for (int i6 = 0; i6 < pressingGoal.keys.length; i6++) {
                if (boolArr[i6] == null) {
                    if (z5) {
                        boolArr[i6] = Boolean.valueOf(zArr[i6]);
                    } else {
                        boolArr[i6] = Boolean.TRUE;
                        z5 = true;
                    }
                }
            }
            if (!z5) {
                boolArr[0] = Boolean.TRUE;
            }
        } else {
            for (int i10 = 0; i10 < pressingGoal.keys.length; i10++) {
                if (boolArr[i10] == null) {
                    boolArr[i10] = Boolean.FALSE;
                }
            }
        }
        for (int i11 = 0; i11 < pressingGoal.keys.length; i11++) {
            if (zArr[i11] != boolArr[i11].booleanValue()) {
                KeyboardMap.KeyPair keyPair2 = pressingGoal.keys[i11];
                synthesizeEvent(boolArr[i11].booleanValue(), Long.valueOf(keyPair2.logicalKey), Long.valueOf(keyPair2.physicalKey), keyEvent.getEventTime());
            }
        }
    }

    public void synchronizeTogglingKey(KeyboardMap.TogglingGoal togglingGoal, boolean z4, long j, KeyEvent keyEvent) {
        if (togglingGoal.logicalKey == j || togglingGoal.enabled == z4) {
            return;
        }
        boolean zContainsKey = this.pressingRecords.containsKey(Long.valueOf(togglingGoal.physicalKey));
        boolean z5 = !zContainsKey;
        if (!zContainsKey) {
            togglingGoal.enabled = !togglingGoal.enabled;
        }
        synthesizeEvent(z5, Long.valueOf(togglingGoal.logicalKey), Long.valueOf(togglingGoal.physicalKey), keyEvent.getEventTime());
        if (zContainsKey) {
            togglingGoal.enabled = !togglingGoal.enabled;
        }
        synthesizeEvent(zContainsKey, Long.valueOf(togglingGoal.logicalKey), Long.valueOf(togglingGoal.physicalKey), keyEvent.getEventTime());
    }

    public void updatePressingState(@NonNull Long l6, @Nullable Long l8) {
        if (l8 != null) {
            if (this.pressingRecords.put(l6, l8) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (this.pressingRecords.remove(l6) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
