package androidx.work.impl.constraints.controllers;

import Ej.InterfaceC0230h;
import androidx.work.Constraints;
import androidx.work.impl.model.WorkSpec;

/* JADX INFO: loaded from: classes2.dex */
public interface ConstraintController {
    boolean hasConstraint(WorkSpec workSpec);

    boolean isCurrentlyConstrained(WorkSpec workSpec);

    InterfaceC0230h track(Constraints constraints);
}
