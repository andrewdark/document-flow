package ua.pp.darknsoft.model.data;

/**
 * Варианты корреспондентов
 */
public enum CorrespondentKind {

	/**
	 * Входящий от организации
	 */
	IncomingOrganization,

	/**
	 * Входящий от гражданина
	 */
	IncomingCitizen,

	/**
	 * Сопроводительный
	 */
	CoverLetter,

	/**
	 * Исходящий к организации
	 */
	OutgoingOrganization,

	/**
	 * Исходящий к гражданину
	 */
	OutgoingCitizen
}
