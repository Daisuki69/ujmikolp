package defpackage;

import cj.C1110A;
import cj.C1112C;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class Extract extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "Bluetooth#ADAPTER", schemaIndex = 16, tag = 17)
    private final Bluetooth bluetooth;

    @WireField(adapter = "CalendarEvent#ADAPTER", jsonName = "calendarEvents", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    private final List<CalendarEvent> calendar_events;

    @WireField(adapter = "CalendarReminder#ADAPTER", jsonName = "calendarReminders", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 8)
    private final List<CalendarReminder> calendar_reminders;

    @WireField(adapter = "Camera#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 18, tag = 19)
    private final List<Camera> cameras;

    @WireField(adapter = "CollectorDetails#ADAPTER", jsonName = "collectorDetails", schemaIndex = 8, tag = 9)
    private final CollectorDetails collector_details;

    @WireField(adapter = "Contact#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    private final List<Contact> contacts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "deviceFonts", label = WireField.Label.REPEATED, schemaIndex = 13, tag = 14)
    private final List<String> device_fonts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "extractionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String extraction_id;

    @WireField(adapter = "GeneralData#ADAPTER", jsonName = "generalData", schemaIndex = 10, tag = 11)
    private final GeneralData general_data;

    @WireField(adapter = "Hardware#ADAPTER", schemaIndex = 9, tag = 10)
    private final Hardware hardware;

    @WireField(adapter = "InstalledApplication#ADAPTER", jsonName = "installedApplications", label = WireField.Label.REPEATED, schemaIndex = 12, tag = 13)
    private final List<InstalledApplication> installed_applications;

    @WireField(adapter = "Location#ADAPTER", schemaIndex = 11, tag = 12)
    private final Location location;

    @WireField(adapter = "MediaCount#ADAPTER", jsonName = "mediaCount", schemaIndex = 4, tag = 5)
    private final MediaCount media_count;

    @WireField(adapter = "Media#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<Media> medias;

    @WireField(adapter = "Network#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 15, tag = 16)
    private final List<Network> network;

    @WireField(adapter = "Performance#ADAPTER", schemaIndex = 19, tag = 20)
    private final Performance performance;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "protoVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int proto_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sdkVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String sdk_version;

    @WireField(adapter = "Sensor#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 17, tag = 18)
    private final List<Sensor> sensors;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 20, tag = 21)
    private final List<String> threats;

    @WireField(adapter = "WifiNetwork#ADAPTER", jsonName = "wifiNetworks", label = WireField.Label.REPEATED, schemaIndex = 14, tag = 15)
    private final List<WifiNetwork> wifi_networks;
    public static final C Companion = new C();
    public static final ProtoAdapter<Extract> ADAPTER = new B(FieldEncoding.LENGTH_DELIMITED, z.a(Extract.class), "type.googleapis.com/Extract", Syntax.PROTO_3, null, "dde-protobuf/main.proto");

    public Extract() {
        this(null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
    }

    public final Extract copy(String sdk_version, int i, String extraction_id, List<Media> medias, MediaCount mediaCount, List<Contact> contacts, List<CalendarEvent> calendar_events, List<CalendarReminder> calendar_reminders, CollectorDetails collectorDetails, Hardware hardware, GeneralData generalData, Location location, List<InstalledApplication> installed_applications, List<String> device_fonts, List<WifiNetwork> wifi_networks, List<Network> network, Bluetooth bluetooth, List<Sensor> sensors, List<Camera> cameras, Performance performance, List<String> threats, ByteString unknownFields) {
        j.g(sdk_version, "sdk_version");
        j.g(extraction_id, "extraction_id");
        j.g(medias, "medias");
        j.g(contacts, "contacts");
        j.g(calendar_events, "calendar_events");
        j.g(calendar_reminders, "calendar_reminders");
        j.g(installed_applications, "installed_applications");
        j.g(device_fonts, "device_fonts");
        j.g(wifi_networks, "wifi_networks");
        j.g(network, "network");
        j.g(sensors, "sensors");
        j.g(cameras, "cameras");
        j.g(threats, "threats");
        j.g(unknownFields, "unknownFields");
        return new Extract(sdk_version, i, extraction_id, medias, mediaCount, contacts, calendar_events, calendar_reminders, collectorDetails, hardware, generalData, location, installed_applications, device_fonts, wifi_networks, network, bluetooth, sensors, cameras, performance, threats, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Extract)) {
            return false;
        }
        Extract extract = (Extract) obj;
        return j.b(unknownFields(), extract.unknownFields()) && j.b(this.sdk_version, extract.sdk_version) && this.proto_version == extract.proto_version && j.b(this.extraction_id, extract.extraction_id) && j.b(this.medias, extract.medias) && j.b(this.media_count, extract.media_count) && j.b(this.contacts, extract.contacts) && j.b(this.calendar_events, extract.calendar_events) && j.b(this.calendar_reminders, extract.calendar_reminders) && j.b(this.collector_details, extract.collector_details) && j.b(this.hardware, extract.hardware) && j.b(this.general_data, extract.general_data) && j.b(this.location, extract.location) && j.b(this.installed_applications, extract.installed_applications) && j.b(this.device_fonts, extract.device_fonts) && j.b(this.wifi_networks, extract.wifi_networks) && j.b(this.network, extract.network) && j.b(this.bluetooth, extract.bluetooth) && j.b(this.sensors, extract.sensors) && j.b(this.cameras, extract.cameras) && j.b(this.performance, extract.performance) && j.b(this.threats, extract.threats);
    }

    public final Bluetooth getBluetooth() {
        return this.bluetooth;
    }

    public final List<CalendarEvent> getCalendar_events() {
        return this.calendar_events;
    }

    public final List<CalendarReminder> getCalendar_reminders() {
        return this.calendar_reminders;
    }

    public final List<Camera> getCameras() {
        return this.cameras;
    }

    public final CollectorDetails getCollector_details() {
        return this.collector_details;
    }

    public final List<Contact> getContacts() {
        return this.contacts;
    }

    public final List<String> getDevice_fonts() {
        return this.device_fonts;
    }

    public final String getExtraction_id() {
        return this.extraction_id;
    }

    public final GeneralData getGeneral_data() {
        return this.general_data;
    }

    public final Hardware getHardware() {
        return this.hardware;
    }

    public final List<InstalledApplication> getInstalled_applications() {
        return this.installed_applications;
    }

    public final Location getLocation() {
        return this.location;
    }

    public final MediaCount getMedia_count() {
        return this.media_count;
    }

    public final List<Media> getMedias() {
        return this.medias;
    }

    public final List<Network> getNetwork() {
        return this.network;
    }

    public final Performance getPerformance() {
        return this.performance;
    }

    public final int getProto_version() {
        return this.proto_version;
    }

    public final String getSdk_version() {
        return this.sdk_version;
    }

    public final List<Sensor> getSensors() {
        return this.sensors;
    }

    public final List<String> getThreats() {
        return this.threats;
    }

    public final List<WifiNetwork> getWifi_networks() {
        return this.wifi_networks;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iD = AbstractC1414e.d(this.medias, AbstractC1414e.c((AbstractC1414e.c(unknownFields().hashCode() * 37, 37, this.sdk_version) + this.proto_version) * 37, 37, this.extraction_id), 37);
        MediaCount mediaCount = this.media_count;
        int iD2 = AbstractC1414e.d(this.calendar_reminders, AbstractC1414e.d(this.calendar_events, AbstractC1414e.d(this.contacts, (iD + (mediaCount != null ? mediaCount.hashCode() : 0)) * 37, 37), 37), 37);
        CollectorDetails collectorDetails = this.collector_details;
        int iHashCode = (iD2 + (collectorDetails != null ? collectorDetails.hashCode() : 0)) * 37;
        Hardware hardware = this.hardware;
        int iHashCode2 = (iHashCode + (hardware != null ? hardware.hashCode() : 0)) * 37;
        GeneralData generalData = this.general_data;
        int iHashCode3 = (iHashCode2 + (generalData != null ? generalData.hashCode() : 0)) * 37;
        Location location = this.location;
        int iD3 = AbstractC1414e.d(this.network, AbstractC1414e.d(this.wifi_networks, AbstractC1414e.d(this.device_fonts, AbstractC1414e.d(this.installed_applications, (iHashCode3 + (location != null ? location.hashCode() : 0)) * 37, 37), 37), 37), 37);
        Bluetooth bluetooth = this.bluetooth;
        int iD4 = AbstractC1414e.d(this.cameras, AbstractC1414e.d(this.sensors, (iD3 + (bluetooth != null ? bluetooth.hashCode() : 0)) * 37, 37), 37);
        Performance performance = this.performance;
        int iHashCode4 = this.threats.hashCode() + ((iD4 + (performance != null ? performance.hashCode() : 0)) * 37);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m12newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("sdk_version=" + Internal.sanitize(this.sdk_version));
        arrayList.add("proto_version=" + this.proto_version);
        AbstractC1414e.p(this.extraction_id, new StringBuilder("extraction_id="), arrayList);
        if (!this.medias.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("medias="), this.medias, arrayList);
        }
        if (this.media_count != null) {
            arrayList.add("media_count=" + this.media_count);
        }
        if (!this.contacts.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("contacts="), this.contacts, arrayList);
        }
        if (!this.calendar_events.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("calendar_events="), this.calendar_events, arrayList);
        }
        if (!this.calendar_reminders.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("calendar_reminders="), this.calendar_reminders, arrayList);
        }
        if (this.collector_details != null) {
            arrayList.add("collector_details=" + this.collector_details);
        }
        if (this.hardware != null) {
            arrayList.add("hardware=" + this.hardware);
        }
        if (this.general_data != null) {
            arrayList.add("general_data=" + this.general_data);
        }
        if (this.location != null) {
            arrayList.add("location=" + this.location);
        }
        if (!this.installed_applications.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("installed_applications="), this.installed_applications, arrayList);
        }
        if (!this.device_fonts.isEmpty()) {
            arrayList.add("device_fonts=" + Internal.sanitize(this.device_fonts));
        }
        if (!this.wifi_networks.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("wifi_networks="), this.wifi_networks, arrayList);
        }
        if (!this.network.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("network="), this.network, arrayList);
        }
        if (this.bluetooth != null) {
            arrayList.add("bluetooth=" + this.bluetooth);
        }
        if (!this.sensors.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("sensors="), this.sensors, arrayList);
        }
        if (!this.cameras.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("cameras="), this.cameras, arrayList);
        }
        if (this.performance != null) {
            arrayList.add("performance=" + this.performance);
        }
        if (!this.threats.isEmpty()) {
            arrayList.add("threats=" + Internal.sanitize(this.threats));
        }
        return C1110A.F(arrayList, ", ", "Extract{", "}", null, 56);
    }

    public Extract(String str, int i, String str2, List list, MediaCount mediaCount, List list2, List list3, List list4, CollectorDetails collectorDetails, Hardware hardware, GeneralData generalData, Location location, List list5, List list6, List list7, List list8, Bluetooth bluetooth, List list9, List list10, Performance performance, List list11, ByteString byteString, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) == 0 ? str2 : "", (i4 & 8) != 0 ? C1112C.f9377a : list, (i4 & 16) != 0 ? null : mediaCount, (i4 & 32) != 0 ? C1112C.f9377a : list2, (i4 & 64) != 0 ? C1112C.f9377a : list3, (i4 & 128) != 0 ? C1112C.f9377a : list4, (i4 & 256) != 0 ? null : collectorDetails, (i4 & 512) != 0 ? null : hardware, (i4 & 1024) != 0 ? null : generalData, (i4 & 2048) != 0 ? null : location, (i4 & 4096) != 0 ? C1112C.f9377a : list5, (i4 & 8192) != 0 ? C1112C.f9377a : list6, (i4 & 16384) != 0 ? C1112C.f9377a : list7, (i4 & 32768) != 0 ? C1112C.f9377a : list8, (i4 & 65536) != 0 ? null : bluetooth, (i4 & 131072) != 0 ? C1112C.f9377a : list9, (i4 & 262144) != 0 ? C1112C.f9377a : list10, (i4 & 524288) != 0 ? null : performance, (i4 & 1048576) != 0 ? C1112C.f9377a : list11, (i4 & 2097152) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m12newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Extract(String sdk_version, int i, String extraction_id, List<Media> medias, MediaCount mediaCount, List<Contact> contacts, List<CalendarEvent> calendar_events, List<CalendarReminder> calendar_reminders, CollectorDetails collectorDetails, Hardware hardware, GeneralData generalData, Location location, List<InstalledApplication> installed_applications, List<String> device_fonts, List<WifiNetwork> wifi_networks, List<Network> network, Bluetooth bluetooth, List<Sensor> sensors, List<Camera> cameras, Performance performance, List<String> threats, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(sdk_version, "sdk_version");
        j.g(extraction_id, "extraction_id");
        j.g(medias, "medias");
        j.g(contacts, "contacts");
        j.g(calendar_events, "calendar_events");
        j.g(calendar_reminders, "calendar_reminders");
        j.g(installed_applications, "installed_applications");
        j.g(device_fonts, "device_fonts");
        j.g(wifi_networks, "wifi_networks");
        j.g(network, "network");
        j.g(sensors, "sensors");
        j.g(cameras, "cameras");
        j.g(threats, "threats");
        j.g(unknownFields, "unknownFields");
        this.sdk_version = sdk_version;
        this.proto_version = i;
        this.extraction_id = extraction_id;
        this.media_count = mediaCount;
        this.collector_details = collectorDetails;
        this.hardware = hardware;
        this.general_data = generalData;
        this.location = location;
        this.bluetooth = bluetooth;
        this.performance = performance;
        this.medias = Internal.immutableCopyOf("medias", medias);
        this.contacts = Internal.immutableCopyOf("contacts", contacts);
        this.calendar_events = Internal.immutableCopyOf("calendar_events", calendar_events);
        this.calendar_reminders = Internal.immutableCopyOf("calendar_reminders", calendar_reminders);
        this.installed_applications = Internal.immutableCopyOf("installed_applications", installed_applications);
        this.device_fonts = Internal.immutableCopyOf("device_fonts", device_fonts);
        this.wifi_networks = Internal.immutableCopyOf("wifi_networks", wifi_networks);
        this.network = Internal.immutableCopyOf("network", network);
        this.sensors = Internal.immutableCopyOf("sensors", sensors);
        this.cameras = Internal.immutableCopyOf("cameras", cameras);
        this.threats = Internal.immutableCopyOf("threats", threats);
    }
}
