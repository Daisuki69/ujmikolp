package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.util.ArrayList;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import pg.E;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: loaded from: classes4.dex */
public class SpellCheckChannel {
    private static final String TAG = "SpellCheckChannel";
    public final u channel;

    @NonNull
    public final s parsingMethodHandler;
    private SpellCheckMethodHandler spellCheckMethodHandler;

    public interface SpellCheckMethodHandler {
        void initiateSpellCheck(@NonNull String str, @NonNull String str2, @NonNull t tVar);
    }

    public SpellCheckChannel(@NonNull DartExecutor dartExecutor) {
        s sVar = new s() { // from class: io.flutter.embedding.engine.systemchannels.SpellCheckChannel.1
            @Override // pg.s
            public void onMethodCall(@NonNull r rVar, @NonNull t tVar) {
                if (SpellCheckChannel.this.spellCheckMethodHandler == null) {
                    return;
                }
                String str = rVar.f19112a;
                Object obj = rVar.f19113b;
                str.getClass();
                if (!str.equals("SpellCheck.initiateSpellCheck")) {
                    tVar.notImplemented();
                    return;
                }
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    SpellCheckChannel.this.spellCheckMethodHandler.initiateSpellCheck((String) arrayList.get(0), (String) arrayList.get(1), tVar);
                } catch (IllegalStateException e) {
                    tVar.error(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, e.getMessage(), null);
                }
            }
        };
        this.parsingMethodHandler = sVar;
        u uVar = new u(dartExecutor, "flutter/spellcheck", E.f19095b, null);
        this.channel = uVar;
        uVar.b(sVar);
    }

    public void setSpellCheckMethodHandler(@Nullable SpellCheckMethodHandler spellCheckMethodHandler) {
        this.spellCheckMethodHandler = spellCheckMethodHandler;
    }
}
