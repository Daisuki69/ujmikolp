package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class HelperWidget extends ConstraintWidget implements Helper {
    public ConstraintWidget[] mWidgets = new ConstraintWidget[4];
    public int mWidgetsCount = 0;

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void add(ConstraintWidget constraintWidget) {
        if (constraintWidget == this || constraintWidget == null) {
            return;
        }
        int i = this.mWidgetsCount + 1;
        ConstraintWidget[] constraintWidgetArr = this.mWidgets;
        if (i > constraintWidgetArr.length) {
            this.mWidgets = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
        }
        ConstraintWidget[] constraintWidgetArr2 = this.mWidgets;
        int i4 = this.mWidgetsCount;
        constraintWidgetArr2[i4] = constraintWidget;
        this.mWidgetsCount = i4 + 1;
    }

    public void addDependents(ArrayList<WidgetGroup> arrayList, int i, WidgetGroup widgetGroup) {
        for (int i4 = 0; i4 < this.mWidgetsCount; i4++) {
            widgetGroup.add(this.mWidgets[i4]);
        }
        for (int i6 = 0; i6 < this.mWidgetsCount; i6++) {
            Grouping.findDependents(this.mWidgets[i6], i, arrayList, widgetGroup);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.copy(constraintWidget, map);
        HelperWidget helperWidget = (HelperWidget) constraintWidget;
        this.mWidgetsCount = 0;
        int i = helperWidget.mWidgetsCount;
        for (int i4 = 0; i4 < i; i4++) {
            add(map.get(helperWidget.mWidgets[i4]));
        }
    }

    public int findGroupInDependents(int i) {
        int i4;
        int i6;
        for (int i10 = 0; i10 < this.mWidgetsCount; i10++) {
            ConstraintWidget constraintWidget = this.mWidgets[i10];
            if (i == 0 && (i6 = constraintWidget.horizontalGroup) != -1) {
                return i6;
            }
            if (i == 1 && (i4 = constraintWidget.verticalGroup) != -1) {
                return i4;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void removeAllIds() {
        this.mWidgetsCount = 0;
        Arrays.fill(this.mWidgets, (Object) null);
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void updateConstraints(ConstraintWidgetContainer constraintWidgetContainer) {
    }
}
