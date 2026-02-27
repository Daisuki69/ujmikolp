package androidx.activity;

import android.app.Application;
import androidx.lifecycle.SavedStateViewModelFactory;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ComponentActivity$defaultViewModelProviderFactory$2 extends kotlin.jvm.internal.k implements Function0<SavedStateViewModelFactory> {
    final /* synthetic */ ComponentActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentActivity$defaultViewModelProviderFactory$2(ComponentActivity componentActivity) {
        super(0);
        this.this$0 = componentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SavedStateViewModelFactory invoke() {
        Application application = this.this$0.getApplication();
        ComponentActivity componentActivity = this.this$0;
        return new SavedStateViewModelFactory(application, componentActivity, componentActivity.getIntent() != null ? this.this$0.getIntent().getExtras() : null);
    }
}
