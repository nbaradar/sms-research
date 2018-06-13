package sms_reasearch;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwilioModule {
	public static final String ACCOUNT_SID = "AC43b40e08139bb37b81b90cf1f8cbeb39";
	public static final String AUTH_TOKEN = "d91ba2814ca3ca8a812fb0605cc7fd1d";
	public static final String TWILIO_NUMBER = "+14433983449";
	
	public TwilioModule(){}
	
	public void sendSMSMessage(String messageBody, String number){
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		
		Message message = Message.creator(new PhoneNumber(number), new PhoneNumber(TWILIO_NUMBER), messageBody).create();
		System.out.println(message.getSid());
	}
}
