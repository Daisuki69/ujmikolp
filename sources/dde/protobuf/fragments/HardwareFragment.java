package dde.protobuf.fragments;

import androidx.core.app.FrameMetricsAggregator;
import cj.C1110A;
import cj.C1112C;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.AbstractC1414e;
import dg.C1369C;
import dg.C1370D;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class HardwareFragment extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "dde.protobuf.fragments.Camera#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    private final List<Camera> cameras;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 1, tag = 2)
    private final Integer coreCount;

    @WireField(adapter = "dde.protobuf.fragments.ExtractionDetails#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ExtractionDetails extractionDetails;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 4, tag = 5)
    private final Integer phoneType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String ramSize;

    @WireField(adapter = "dde.protobuf.fragments.Resolution#ADAPTER", schemaIndex = 3, tag = 4)
    private final Resolution screenSize;

    @WireField(adapter = "dde.protobuf.fragments.Sensor#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 8)
    private final List<Sensor> sensors;

    @WireField(adapter = "dde.protobuf.fragments.Volume#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    private final List<Volume> volumes;
    public static final C1370D Companion = new C1370D();
    public static final ProtoAdapter<HardwareFragment> ADAPTER = new C1369C(FieldEncoding.LENGTH_DELIMITED, z.a(HardwareFragment.class), "type.googleapis.com/dde.protobuf.fragments.HardwareFragment", Syntax.PROTO_3, null, "dde-protobuf/fragments/HardwareFragment.proto");

    public HardwareFragment() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HardwareFragment copy$default(HardwareFragment hardwareFragment, ExtractionDetails extractionDetails, Integer num, String str, Resolution resolution, Integer num2, List list, List list2, List list3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            extractionDetails = hardwareFragment.extractionDetails;
        }
        if ((i & 2) != 0) {
            num = hardwareFragment.coreCount;
        }
        if ((i & 4) != 0) {
            str = hardwareFragment.ramSize;
        }
        if ((i & 8) != 0) {
            resolution = hardwareFragment.screenSize;
        }
        if ((i & 16) != 0) {
            num2 = hardwareFragment.phoneType;
        }
        if ((i & 32) != 0) {
            list = hardwareFragment.cameras;
        }
        if ((i & 64) != 0) {
            list2 = hardwareFragment.volumes;
        }
        if ((i & 128) != 0) {
            list3 = hardwareFragment.sensors;
        }
        if ((i & 256) != 0) {
            byteString = hardwareFragment.unknownFields();
        }
        List list4 = list3;
        ByteString byteString2 = byteString;
        List list5 = list;
        List list6 = list2;
        Integer num3 = num2;
        String str2 = str;
        return hardwareFragment.copy(extractionDetails, num, str2, resolution, num3, list5, list6, list4, byteString2);
    }

    public final HardwareFragment copy(ExtractionDetails extractionDetails, Integer num, String str, Resolution resolution, Integer num2, List<Camera> cameras, List<Volume> volumes, List<Sensor> sensors, ByteString unknownFields) {
        j.g(cameras, "cameras");
        j.g(volumes, "volumes");
        j.g(sensors, "sensors");
        j.g(unknownFields, "unknownFields");
        return new HardwareFragment(extractionDetails, num, str, resolution, num2, cameras, volumes, sensors, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HardwareFragment)) {
            return false;
        }
        HardwareFragment hardwareFragment = (HardwareFragment) obj;
        return j.b(unknownFields(), hardwareFragment.unknownFields()) && j.b(this.extractionDetails, hardwareFragment.extractionDetails) && j.b(this.coreCount, hardwareFragment.coreCount) && j.b(this.ramSize, hardwareFragment.ramSize) && j.b(this.screenSize, hardwareFragment.screenSize) && j.b(this.phoneType, hardwareFragment.phoneType) && j.b(this.cameras, hardwareFragment.cameras) && j.b(this.volumes, hardwareFragment.volumes) && j.b(this.sensors, hardwareFragment.sensors);
    }

    public final List<Camera> getCameras() {
        return this.cameras;
    }

    public final Integer getCoreCount() {
        return this.coreCount;
    }

    public final ExtractionDetails getExtractionDetails() {
        return this.extractionDetails;
    }

    public final Integer getPhoneType() {
        return this.phoneType;
    }

    public final String getRamSize() {
        return this.ramSize;
    }

    public final Resolution getScreenSize() {
        return this.screenSize;
    }

    public final List<Sensor> getSensors() {
        return this.sensors;
    }

    public final List<Volume> getVolumes() {
        return this.volumes;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ExtractionDetails extractionDetails = this.extractionDetails;
        int iHashCode2 = (iHashCode + (extractionDetails != null ? extractionDetails.hashCode() : 0)) * 37;
        Integer num = this.coreCount;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        String str = this.ramSize;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        Resolution resolution = this.screenSize;
        int iHashCode5 = (iHashCode4 + (resolution != null ? resolution.hashCode() : 0)) * 37;
        Integer num2 = this.phoneType;
        int iHashCode6 = this.sensors.hashCode() + AbstractC1414e.d(this.volumes, AbstractC1414e.d(this.cameras, (iHashCode5 + (num2 != null ? num2.hashCode() : 0)) * 37, 37), 37);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m240newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.extractionDetails != null) {
            arrayList.add("extractionDetails=" + this.extractionDetails);
        }
        if (this.coreCount != null) {
            AbstractC1414e.r(new StringBuilder("coreCount="), this.coreCount, arrayList);
        }
        if (this.ramSize != null) {
            AbstractC1414e.p(this.ramSize, new StringBuilder("ramSize="), arrayList);
        }
        if (this.screenSize != null) {
            arrayList.add("screenSize=" + this.screenSize);
        }
        if (this.phoneType != null) {
            AbstractC1414e.r(new StringBuilder("phoneType="), this.phoneType, arrayList);
        }
        if (!this.cameras.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("cameras="), this.cameras, arrayList);
        }
        if (!this.volumes.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("volumes="), this.volumes, arrayList);
        }
        if (!this.sensors.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("sensors="), this.sensors, arrayList);
        }
        return C1110A.F(arrayList, ", ", "HardwareFragment{", "}", null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HardwareFragment(ExtractionDetails extractionDetails, Integer num, String str, Resolution resolution, Integer num2, List<Camera> cameras, List<Volume> volumes, List<Sensor> sensors, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(cameras, "cameras");
        j.g(volumes, "volumes");
        j.g(sensors, "sensors");
        j.g(unknownFields, "unknownFields");
        this.extractionDetails = extractionDetails;
        this.coreCount = num;
        this.ramSize = str;
        this.screenSize = resolution;
        this.phoneType = num2;
        this.cameras = Internal.immutableCopyOf("cameras", cameras);
        this.volumes = Internal.immutableCopyOf("volumes", volumes);
        this.sensors = Internal.immutableCopyOf("sensors", sensors);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m240newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public HardwareFragment(ExtractionDetails extractionDetails, Integer num, String str, Resolution resolution, Integer num2, List list, List list2, List list3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : extractionDetails, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : resolution, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? C1112C.f9377a : list, (i & 64) != 0 ? C1112C.f9377a : list2, (i & 128) != 0 ? C1112C.f9377a : list3, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }
}
