package com.dynatrace.agent.events.enrichment;

/* JADX INFO: loaded from: classes2.dex */
public final class EventKeys {
    public static final String BROWSER = "browser";
    public static final String CLIENT = "client";
    public static final String DURATION = "duration";
    public static final String END_TIME = "end_time";
    public static final EventKeys INSTANCE = new EventKeys();
    public static final String PERFORMANCE = "performance";
    public static final String SPAN_ID = "span.id";
    public static final String START_TIME = "start_time";
    public static final String TIME_CORRECTION = "time_correction";
    public static final String TRACE_ID = "trace.id";

    public static final class APP {
        public static final String BUNDLE = "app.bundle";
        public static final APP INSTANCE = new APP();
        public static final String NAMESPACE = "app.";
        public static final String SHORT_VERSION = "app.short_version";
        public static final String VERSION = "app.version";

        private APP() {
        }
    }

    public static final class APPSTART {
        public static final APPSTART INSTANCE = new APPSTART();
        public static final String NAMESPACE = "app_start.";
        public static final String TYPE = "app_start.type";

        private APPSTART() {
        }
    }

    public static final class Characteristics {
        public static final String HAS_ANR = "characteristics.has_anr";
        public static final String HAS_APP_START = "characteristics.has_app_start";
        public static final String HAS_CRASH = "characteristics.has_crash";
        public static final String HAS_ERROR = "characteristics.has_error";
        public static final String HAS_EVENT_PROPERTIES = "characteristics.has_event_properties";
        public static final String HAS_EXCEPTION = "characteristics.has_exception";
        public static final String HAS_FAILED_REQUEST = "characteristics.has_failed_request";
        public static final String HAS_NAVIGATION = "characteristics.has_navigation";
        public static final String HAS_REQUEST = "characteristics.has_request";
        public static final String HAS_SESSION_PROPERTIES = "characteristics.has_session_properties";
        public static final String HAS_USER_INTERACTION = "characteristics.has_user_interaction";
        public static final String HAS_VIEW_SUMMARY = "characteristics.has_view_summary";
        public static final String HAS_VISIBILITY_CHANGE = "characteristics.has_visibility_change";
        public static final Characteristics INSTANCE = new Characteristics();
        public static final String IS_API_REPORTED = "characteristics.is_api_reported";
        public static final String IS_INTERNAL = "characteristics.is_internal";
        public static final String IS_SELF_MONITORING = "characteristics.is_self_monitoring";
        public static final String NAMESPACE = "characteristics.";

        private Characteristics() {
        }
    }

    public static final class DEVICE {
        public static final String BATTERY_LEVEL = "device.battery.level";
        public static final DEVICE INSTANCE = new DEVICE();
        public static final String IS_ROOTED = "device.is_rooted";
        public static final String MANUFACTURER = "device.manufacturer";
        public static final String MODEL_IDENTIFIER = "device.model.identifier";
        public static final String NAMESPACE = "device.";
        public static final String ORIENTATION = "device.orientation";
        public static final String SCREEN_HEIGHT = "device.screen.height";
        public static final String SCREEN_WIDTH = "device.screen.width";

        private DEVICE() {
        }
    }

    public static final class DT {
        public static final DT INSTANCE = new DT();
        public static final String NAMESPACE = "dt.";

        public static final class RUM {
            public static final String AGENT_TYPE = "dt.rum.agent.type";
            public static final String AGENT_VERSION = "dt.rum.agent.version";
            public static final String APPLICATION_ID = "dt.rum.application.id";
            public static final String EVENT_SOURCE_TYPE = "dt.rum.event.source.type";
            public static final RUM INSTANCE = new RUM();
            public static final String INSTANCE_ID = "dt.rum.instance.id";
            public static final String NAMESPACE = "dt.rum.";
            public static final String SCHEMA_VERSION = "dt.rum.schema_version";
            public static final String SID = "dt.rum.sid";
            public static final String USER_TAG = "dt.rum.user_tag";

            private RUM() {
            }
        }

        public static final class SUPPORT {
            public static final String API_HAS_DROPPED_CUSTOM_PROPERTIES = "dt.support.api.has_dropped_custom_properties";
            public static final String API_HAS_ENRICH_EXCEPTION = "dt.support.api.has_enrich_exception";
            public static final String API_OVERRIDDEN_FIELDS = "dt.support.api.overridden_fields";
            public static final String HAS_NFN_VALUES = "dt.support.has_nfn_values";
            public static final SUPPORT INSTANCE = new SUPPORT();
            public static final String LEGACY_API_REPORTED = "dt.support.is_legacy_api_reported";
            public static final String NAMESPACE = "dt.support.";

            private SUPPORT() {
            }
        }

        private DT() {
        }
    }

    public static final class ERROR {
        public static final String CODE = "error.code";
        public static final String HAS_CUSTOM_NAME = "error.has_custom_name";
        public static final ERROR INSTANCE = new ERROR();
        public static final String IS_FATAL = "error.is_fatal";
        public static final String NAME = "error.name";
        private static final String NAMESPACE = "error.";

        private ERROR() {
        }
    }

    public static final class EVENT_PROPERTIES {
        public static final EVENT_PROPERTIES INSTANCE = new EVENT_PROPERTIES();
        public static final String NAMESPACE = "event_properties.";

        private EVENT_PROPERTIES() {
        }
    }

    public static final class EXCEPTION {
        public static final String CRASH_SIGNAL = "exception.crash_signal_name";
        public static final EXCEPTION INSTANCE = new EXCEPTION();
        public static final String MESSAGE = "exception.message";
        private static final String NAMESPACE = "exception.";
        public static final String STACK_TRACE = "exception.stack_trace";
        public static final String TYPE = "exception.type";

        private EXCEPTION() {
        }
    }

    public static final class GEO {
        public static final GEO INSTANCE = new GEO();
        public static final String LOCATION_LAT = "geo.location.latitude";
        public static final String LOCATION_LON = "geo.location.longitude";
        public static final String NAMESPACE = "geo.";

        private GEO() {
        }
    }

    public static final class HTTP {
        public static final HTTP INSTANCE = new HTTP();
        private static final String NAMESPACE = "http.";
        public static final String REQUEST_HEADER = "http.request.header";
        public static final String REQUEST_METHOD = "http.request.method";
        public static final String RESPONSE_HEADER = "http.response.header";
        public static final String RESPONSE_REASON_PHRASE = "http.response.reason_phrase";
        public static final String RESPONSE_STATUS_CODE = "http.response.status_code";

        private HTTP() {
        }
    }

    public static final class NETWORK {
        public static final String CONNECTION_TYPE = "network.connection.type";
        public static final NETWORK INSTANCE = new NETWORK();
        public static final String NAMESPACE = "network.";
        public static final String PROTOCOL_NAME = "network.protocol.name";

        private NETWORK() {
        }
    }

    public static final class OS {
        public static final OS INSTANCE = new OS();
        public static final String NAME = "os.name";
        public static final String NAMESPACE = "os.";
        public static final String VERSION = "os.version";

        private OS() {
        }
    }

    public static final class REQUEST {
        public static final String BYTES_RECEIVED = "request.bytes_received";
        public static final String BYTES_SENT = "request.bytes_sent";
        public static final REQUEST INSTANCE = new REQUEST();
        private static final String NAMESPACE = "request.";
        public static final String TRACE_CONTEXT_HINT = "request.trace_context_hint";

        private REQUEST() {
        }
    }

    public static final class SESSION_PROPERTIES {
        public static final SESSION_PROPERTIES INSTANCE = new SESSION_PROPERTIES();
        public static final String NAMESPACE = "session_properties.";

        private SESSION_PROPERTIES() {
        }
    }

    public static final class URL {
        public static final String FULL = "url.full";
        public static final URL INSTANCE = new URL();
        private static final String NAMESPACE = "url.";

        private URL() {
        }
    }

    public static final class VIEW {
        public static final String ID = "view.instance_id";
        public static final VIEW INSTANCE = new VIEW();
        public static final String NAME = "view.name";
        public static final String NAMESPACE = "view.";

        private VIEW() {
        }
    }

    public static final class VISIBILITY {
        public static final VISIBILITY INSTANCE = new VISIBILITY();
        private static final String NAMESPACE = "visibility.";
        public static final String STATE = "visibility.state";

        private VISIBILITY() {
        }
    }

    public static final class WEBSOCKET {
        public static final String CONNECTION_STATUS_CODE = "websocket.connection.status_code";
        public static final WEBSOCKET INSTANCE = new WEBSOCKET();
        private static final String NAMESPACE = "websocket.";

        private WEBSOCKET() {
        }
    }

    private EventKeys() {
    }
}
