package androidx.window.area.utils;

import android.util.DisplayMetrics;
import androidx.annotation.RequiresApi;
import defpackage.AbstractC1414e;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(17)
public final class DeviceMetrics {
    private final String manufacturer;
    private final String model;
    private final DisplayMetrics rearDisplayMetrics;

    public DeviceMetrics(String manufacturer, String model, DisplayMetrics rearDisplayMetrics) {
        j.g(manufacturer, "manufacturer");
        j.g(model, "model");
        j.g(rearDisplayMetrics, "rearDisplayMetrics");
        this.manufacturer = manufacturer;
        this.model = model;
        this.rearDisplayMetrics = rearDisplayMetrics;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DeviceMetrics)) {
            return false;
        }
        DeviceMetrics deviceMetrics = (DeviceMetrics) obj;
        return j.b(this.manufacturer, deviceMetrics.manufacturer) && j.b(this.model, deviceMetrics.model) && this.rearDisplayMetrics.equals(deviceMetrics.rearDisplayMetrics);
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getModel() {
        return this.model;
    }

    public final DisplayMetrics getRearDisplayMetrics() {
        return this.rearDisplayMetrics;
    }

    public int hashCode() {
        return this.rearDisplayMetrics.hashCode() + AbstractC1414e.c(this.manufacturer.hashCode() * 31, 31, this.model);
    }

    public String toString() {
        return "DeviceMetrics{ Manufacturer: " + this.manufacturer + ", model: " + this.model + ", Rear display metrics: " + this.rearDisplayMetrics + " }";
    }
}
