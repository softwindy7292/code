package edu.ict.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StarVO {
	private int starCount;

	public StringBuffer getStar() {
		StringBuffer print = new StringBuffer();

		for (int i = 0; i < starCount; i++) {
			for (int j = 0; j <= i; j++) {
				print.append("*");
			}
			print.append("<br>");
		}

		return print;
	}
}
