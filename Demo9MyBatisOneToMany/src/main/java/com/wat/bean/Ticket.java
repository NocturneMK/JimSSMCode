package com.wat.bean;

public class Ticket {
       private   Integer    ticketId;
       private   String     ticketAddress;
       private   int        ticketPrice;
       private   int        ticketCId;
		public Integer getTicketId() {
			return ticketId;
		}
		public void setTicketId(Integer ticketId) {
			this.ticketId = ticketId;
		}
		public String getTicketAddress() {
			return ticketAddress;
		}
		public void setTicketAddress(String ticketAddress) {
			this.ticketAddress = ticketAddress;
		}
		public int getTicketPrice() {
			return ticketPrice;
		}
		public void setTicketPrice(int ticketPrice) {
			this.ticketPrice = ticketPrice;
		}
		public int getTicketCId() {
			return ticketCId;
		}
		public void setTicketCId(int ticketCId) {
			this.ticketCId = ticketCId;
		}
}
