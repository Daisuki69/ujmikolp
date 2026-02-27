package qg;

import android.content.Context;
import android.content.res.Configuration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.flutter.embedding.engine.systemchannels.LocalizationChannel;
import java.util.Locale;

/* JADX INFO: renamed from: qg.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2173a implements LocalizationChannel.LocalizationMessageHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2174b f19784a;

    public C2173a(C2174b c2174b) {
        this.f19784a = c2174b;
    }

    @Override // io.flutter.embedding.engine.systemchannels.LocalizationChannel.LocalizationMessageHandler
    public final String getStringResource(String str, String str2) {
        C2174b c2174b = this.f19784a;
        Context contextCreateConfigurationContext = c2174b.f19786b;
        if (str2 != null) {
            Locale localeA = C2174b.a(str2);
            Configuration configuration = new Configuration(c2174b.f19786b.getResources().getConfiguration());
            configuration.setLocale(localeA);
            contextCreateConfigurationContext = c2174b.f19786b.createConfigurationContext(configuration);
        }
        int identifier = contextCreateConfigurationContext.getResources().getIdentifier(str, TypedValues.Custom.S_STRING, c2174b.f19786b.getPackageName());
        if (identifier != 0) {
            return contextCreateConfigurationContext.getResources().getString(identifier);
        }
        return null;
    }
}
