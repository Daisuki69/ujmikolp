package androidx.fragment.app.strictmode;

import We.s;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class WrongNestedHierarchyViolation extends Violation {
    private final int containerId;
    private final Fragment expectedParentFragment;

    public WrongNestedHierarchyViolation(Fragment fragment, Fragment expectedParentFragment, int i) {
        j.g(fragment, "fragment");
        j.g(expectedParentFragment, "expectedParentFragment");
        StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
        sb2.append(fragment);
        sb2.append(" within the view of parent fragment ");
        sb2.append(expectedParentFragment);
        sb2.append(" via container with ID ");
        super(fragment, s.o(sb2, " without using parent's childFragmentManager", i));
        this.expectedParentFragment = expectedParentFragment;
        this.containerId = i;
    }

    public final int getContainerId() {
        return this.containerId;
    }

    public final Fragment getExpectedParentFragment() {
        return this.expectedParentFragment;
    }
}
