package androidx.window.area;

import android.content.Context;
import android.view.View;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import androidx.window.extensions.area.WindowAreaComponent;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
public final class RearDisplayPresentationSessionPresenterImpl implements WindowAreaSessionPresenter {
    private final Context context;
    private final ExtensionWindowAreaPresentation presentation;
    private final WindowAreaComponent windowAreaComponent;

    public RearDisplayPresentationSessionPresenterImpl(WindowAreaComponent windowAreaComponent, ExtensionWindowAreaPresentation presentation) {
        j.g(windowAreaComponent, "windowAreaComponent");
        j.g(presentation, "presentation");
        this.windowAreaComponent = windowAreaComponent;
        this.presentation = presentation;
        Context presentationContext = presentation.getPresentationContext();
        j.f(presentationContext, "presentation.presentationContext");
        this.context = presentationContext;
    }

    @Override // androidx.window.area.WindowAreaSession
    public void close() {
        this.windowAreaComponent.endRearDisplayPresentationSession();
    }

    @Override // androidx.window.area.WindowAreaSessionPresenter
    public Context getContext() {
        return this.context;
    }

    @Override // androidx.window.area.WindowAreaSessionPresenter
    public void setContentView(View view) {
        j.g(view, "view");
        this.presentation.setPresentationView(view);
    }
}
