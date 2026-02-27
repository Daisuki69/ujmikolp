package h2;

import com.dynatrace.android.agent.Global;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16864a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f16864a) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            case 2:
                return str.startsWith("event");
            default:
                return str.startsWith("event") && !str.endsWith(Global.UNDERSCORE);
        }
    }
}
