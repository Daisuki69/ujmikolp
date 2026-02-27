package androidx.webkit;

import androidx.annotation.UiThread;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@UiThread
public interface ProfileStore {
    boolean deleteProfile(String str);

    List<String> getAllProfileNames();

    Profile getOrCreateProfile(String str);

    Profile getProfile(String str);
}
