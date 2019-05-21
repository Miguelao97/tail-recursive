package project.generator.domain;

public enum ELanguages {

	ALBANIAN("Albanian", "Shqip", "al", "sq"),
	ARABIC_LIBYA("Arabic (Libya)", "العربية", "ar-ly"),
	ARMENIAN("Armenian", "Հայերեն", "hy", "hy-am"),
	BELORUSSIAN("Belorussian", "Беларускі", "by", "be-by"),
	BENGALI("Bengali", "বাংলা", "bn", "bn-bd"),
	CATALAN("Catalan", "Català", "ca"),
	CHINESE_SIMPLIFIED("Chinese (Simplified)", "中文（简体）", "zh-cn", "zn-Hans"),
	CHINESE_TRADITIONAL("Chinese (Traditional)", "繁體中文", "zh-tw", "zn-Hant"),
	CZECH("Czech", "Český", "cs"),
	DANISH("Danish", "Dansk", "da"),
	DUTCH("Dutch", "Nederlands", "nl"),
	ENGLISH("English", "English", "en"),
	ESTONIAN("Estonian", "Eesti", "et"),
	FARSI("Farsi", "فارسی", "fa"),
	FRENCH("French", "Français", "fr"),
	GALICIAN("Galician", "Galego", "gl"),
	GERMAN("German", "Deutsch", "de"),
	GREEK("Greek", "Ελληνικά", "el"),
	HINDI("Hindi", "हिंदी", "hi"),
	HUNGARIAN("Hungarian", "Magyar", "hu"),
	INDONESIAN("Indonesian", "Bahasa Indonesia", "id"),
	ITALIAN("Italian", "Italiano", "it"),
	JAPANESE("Japanese", "日本語", "ja"),
	KOREAN("Korean", "한국어", "ko"),
	MARATHI("Marathi", "मराठी", "mr"),
	MYANMAR("Myanmar", "မြန်မာ", "my"),
	POLISH("Polish", "Polski", "pl"),
	PORTUGUESE_BRASIL("Portuguese (Brazilian)", "Português (Brasil)", "pt-br", "pt"),
	PORTUGUESE("Portuguese", "Português", "pt-pt", "pt-PT"),
	ROMANIAN("Romanian", "Română", "ro"),
	RUSSIAN("Russian", "Русский", "ru"),
	SLOVAK("Slovak", "Slovenský", "sk"),
	SERBIAN("Serbian", "Srpski", "sr"),
	SPANISH("Spanish", "Español", "es"),
	SWEDISH("Swedish", "Svenska", "sv"),
	TURKISH("Turkish", "Türkçe", "tr"),
	TAMIL("Tamil", "தமிழ்", "ta"),
	TELUGU("Telugu", "తెలుగు", "te"),
	THAI("Thai", "ไทย", "th"),
	UKRAINIAN("Ukrainian", "Українська", "ua", "uk"),
	UZBEK_CYRILLIC("Uzbek (Cyrillic)", "Ўзбекча", "uz-cyr", "uz-Cyr"),
	UZBEK_LATIN("Uzbek (Latin)", "O`zbekcha", "uz-lat", "uz-Lat"),
	VIETNAMESE("Vietnamese", "Tiếng Việt", "vi")
	;

	private final String name;
	private final String  dispName;
	private final String value;
	private final String momentLocaleId;


	ELanguages(String name, String dispName, String value, String momentLocaleId) {
		this.name = name;
		this.dispName = dispName;
		this.value = value;
		this.momentLocaleId = momentLocaleId;
	}

	ELanguages(String name, String dispName, String value) {
		this.name = name;
		this.dispName = dispName;
		this.value = value;
		this.momentLocaleId = null;
	}

	public String getName() {
		return name;
	}

	public String getDispName() {
		return dispName;
	}

	public String getValue() {
		return value;
	}

	public String getMomentLocaleId() {
		return momentLocaleId;
	}

}
