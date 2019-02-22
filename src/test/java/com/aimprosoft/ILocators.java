package com.aimprosoft;

import org.yecht.Data;

public interface ILocators {
    //Registration page1
    String TITTLE_RP = "//div[@class='text-center']";
    String EMAIL_FIELD = "//input[@placeholder='Email']";
    String SUBMIT_BUTTON = "//button[@type='submit']";
    String CANCEL_BUTTON = "//a[@id='cancel-recovery']";
    String BTA_LINK = "//a[contains(text(),'Back to authorization')]";
    String ERROR_MESS = "(//div[.='$1'])[4]";

    //Registration page2
    String EMAIL_BLOCK = "//input[@placeholder='Email']";
    String SEND_AGAIN = "//a[@class='send-again']";
    String CONF_CODE_TXT = "//span[@class='confirm-code-status']";
    String CONF_CODE = "//input[@placeholder='Email confirmation code']";
    String LOGIN = "//input[@placeholder='Login']";
    String PASS1 = "//div//div[@class='inputs-wrapper']//div//div[3]//div[1]//input[1]";
    String PASS2 = "//div//div[4]//div[1]//input[1]";
    String ERROR2 = "//div[@class='inputs-wrapper']//div//div[3]//div[1]//div[1]";

    //Login page
    String LOG_PAGE = "//span[contains(text(),'Sign')]";
    String PASS = "//input[@placeholder='Password']";
    String REM_ME = "//label[@class='login-check-text']";
    String FORGOT = "//a[@class='form-forgot']";
    String SIGN_IN = "//button[@type='submit']";
    String LOGIN_FORM_REGISTER_LINK = "//a[.='Register']";
    String REG_FORM_TITLE = "//h1[contains(text(),'Aimprosoft')]";
    String LOGIN_FORM_INPUT_FIELDS = "//input[@name='$1']";
    String TEAM_NAME = "//div[.='Chat']";
    String LOADER = "//div[@class='inner']";
    String ERR_UNAUT = "//div[@class='alert alert-danger']";
    String ERR_LOGIN = "//div[@class='text-danger']";
    String CHECK_CIRKLE = "//i[contains(@class,'material-icons 25 md-dark')]";
    String SHOW_PASS = "//span[@class='password-show']";

    //PasswordRecovery pages
    String RECOVERY_PAGE1 = "//h1[contains(text(),'Forgot password?')]";
    String RECOVERY_PAGE2 = "//strong[contains(text(),'Generated password or your own')]";
    String SRI_BUTT = "//button[@id='submit-recovery-request']";
    String GEN_PASS = "//input[@placeholder='Generated password']";
    String REC_PASS1 = "//div[@class='inputs-wrapper']//div[2]//div[1]//input[1]";
    String REC_PASS2 = "//div[@class='inputs-wrapper']//div[3]//div[1]//input[1]";
    String USE_GEN_PASS = "//button[contains(text(),'Use generated pass')]";
    String USE_CUST_PASS = "//button[contains(text(),'Use custom pass')]";
    String ERROR = "//div[contains(text(),'$1')]";

    //Main page
    String LEFT_PANEL = "//div[@id='left-panel']";
    String HEADER = "//div[@class='container']";
    String RIGHT_PANEL = "//div[@class='right-control-panel']";
    String MIDDL = "//div[@id='chat-scroll4']";
    String FOOTER = "//div[@class='footer']";
    //Left panel
    String USR_MENU = "//div[@class='dropdown-user-menu']";
    String ROOM_LIST = "//a[contains(text(),'Rooms')]";
    String DIRECT_L = "//div[@class='left-panel']//div//div[2]//h2[1]";
    String NAV_PANEL = "//div[@class='navigation-panel']";
    String TEAMNAME = "//div[@class='team-name']";
    String AVATAR = "//img[@class='aim-avatar img-circle']";
    String USERNAME = "//p[@class='username']";
    String BELL = "//span[@class='mute-toggle fa fa-bell-o']";
    String ROOMS = "//a[contains(text(),'Rooms')]";
    String ADD_ROOM = "//a[@class='add-room-button']";
    String DIRECT = "//a[contains(text(),'Direct')]";
    String ADD_DIRECT = "//a[@class='add-direct-button']";
    String GENERAL = "//span[contains(text(),'General')]";
    String NP_SEARCH = "//input[@placeholder='Go to room']";
    String NP_CLOSE = "//i[contains(text(),'highlight_off')]";
    //Header
    String H_TITLE = "//div[@class='channel-title']";
    String H_CNTRL = "//div[@class='b-chat-header_controls-wrap']";
    String H_SEARCH = "//input[@placeholder='Search...']";
    String H_ROOM_NAME = "//div[@class='channel-room-name']";
    String H_TEAM = "//div[@id='service-block-toggle']";
    //Right panel
    String RP_ROOM_MEMBERS = "//i[contains(text(),'supervisor_account')]";
    String RP_PINNED_MESS = "//*[contains(@fill,'#1f2d33')]";
    String RP_STARRED_MESS = "//i[contains(text(),'star_border')]";
    String RP_UPLOADED_FILES = "//i[contains(text(),'file_upload')]";
    String RP_ROOM_SETTINGS = "//i[contains(@class,'material-icons 32 md-dark')][contains(text(),'settings')]";
    //Footer
    String F_INPUT_TEXT = "//textarea[@id='input-text-field']";
    String F_UPLOAD = "//div[@class='button-input']";
    String F_STICKERS = "//div[@id='sticker_form']";
    String F_EMOJI = "//div[@id='emo_form']";
    //User menu
    String UM_PROFILE = "//span[contains(text(),'Profile')]";
    String UM_SIGN_OUT = "//span[contains(text(),'Sign out')]";
    String UM_JOIN_AT = "//span[contains(text(),'Join another team')]";
    String UM_DOWNLOAD = "//span[@class='download']";

    //Profile page
    String PROFILE_PAGE = "//h1[contains(text(),'Edit your profile')]";
    String PRF_FIRST_NAME = "//input[@name='firstName']";
    String PRF_LAST_NAME = "//input[@name='lastName']";
    String PRF_PHONE = "//input[@name='phone']";
    String PRF_SKYPE = "//input[@name='skype']";
    String PRF_WHTIDO = "//input[@name='whatIDo']";
    String PRF_WHRIM = "//input[@name='whereIAm']";
    String PRF_TIMEZONE = "//select[@name='timezoneProfile']";
    String PRF_SAVE = "//button[@type='button']";
    String PRF_AVATAR = "//img[@class='img-responsive']";
    String PRF_CHGAVATAR = "//label[contains(@class,'btn btn-default')]";

    //Account settings page
    String PROFILE_SET = "//div[@class='settings-item active']";
    String ACC_SET = "//div[contains(text(),'Account settings')]";
    String NOTIF_SET = "//div[contains(text(),'Notification settings')]";
    String ACC_SET_PAGE = "//div[contains(text(),'Edit your settings')]";
    String ACC_EMAIL = "//input[@name='email']";
    String ACC_EMAIL_VAL = "//input[@value='$1']";
    String ACC_USERNAME = "//input[@name='username']";
    String ACC_USERNAME_VAL = "//input[@value='$1']";
    String ACC_OLD_PASS = "//input[@name='password']";
    String ACC_NEW_PASS = "//input[@name='password2']";

    //Notification settings page
    String NS_PAGE = "//h1[contains(text(),'Desktop Notifications')]";
    String NS_DESK_ACT = "//select[@id='desktopActions']";
    String NS_DECK_SOUND = "//select[@id='desktopSound']";
    String NS_MOB_ACT = "//select[@id='mobileActions']";
    String NS_MOB_SOUND = "//select[@id='mobileSound']";
    String NS_ROOM_SET = "//h1[contains(text(),'Room Specific Settings')]";
    String NS_DND_SW = "//div[@class='switch-el undefined']";
    String NS_MAR_MES = "//h1[contains(text(),'Marking messages as read')]";
    String NS_MUTE_ALL = "//span[contains(text(),'Mute all chat for:')]";
    String NS_MUTE_20M = "//span[contains(text(),'20 minutes')]";
    String NS_MUTE_1H = "//span[contains(text(),'1 hour')]";
    String NS_MUTE_2H = "//span[contains(text(),'2 hours')]";
    String NS_MUTE_4H = "//div[contains(@class,'left-panel')]//ul[contains(@class,'')]//li[5]//a[1]//span[1]";
    String NS_MUTE_8H = "//span[contains(text(),'8 hours')]";
    String NS_MUTE_24H = "//span[contains(text(),'24 hours')]";
    String NS_SETTINGS = "//span[contains(@class,'settings')]";

}
