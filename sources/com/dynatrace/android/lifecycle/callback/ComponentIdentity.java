package com.dynatrace.android.lifecycle.callback;

import We.s;

/* JADX INFO: loaded from: classes2.dex */
public class ComponentIdentity {
    private final String componentName;
    private final int uniqueId;

    public ComponentIdentity(String str, int i) {
        this.componentName = str;
        this.uniqueId = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ComponentIdentity componentIdentity = (ComponentIdentity) obj;
            if (this.uniqueId != componentIdentity.uniqueId) {
                return false;
            }
            String str = this.componentName;
            String str2 = componentIdentity.componentName;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public String getComponentName() {
        return this.componentName;
    }

    public int hashCode() {
        String str = this.componentName;
        return ((str != null ? str.hashCode() : 0) * 31) + this.uniqueId;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ComponentIdentity{componentName='");
        sb2.append(this.componentName);
        sb2.append("', uniqueId=");
        return s.m(sb2, this.uniqueId, '}');
    }
}
