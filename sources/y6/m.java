package Y6;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.paymaya.mayaui.common.view.fragment.impl.MayaWebFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaWebFragment f6770b;

    public /* synthetic */ m(MayaWebFragment mayaWebFragment, int i) {
        this.f6769a = i;
        this.f6770b = mayaWebFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6769a) {
            case 0:
                Bundle arguments = this.f6770b.getArguments();
                return Boolean.valueOf(arguments != null ? arguments.getBoolean("use_file_access", false) : false);
            default:
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                MayaWebFragment mayaWebFragment = this.f6770b;
                intent.setData(Uri.fromParts("package", mayaWebFragment.requireContext().getPackageName(), null));
                try {
                    mayaWebFragment.I0.launch(intent);
                    break;
                } catch (ActivityNotFoundException unused) {
                    yk.a.b();
                }
                return Unit.f18162a;
        }
    }
}
