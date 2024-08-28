package be.vdab.goededoel;

import java.math.BigDecimal;

/**
 * Een <strong>goed doel</strong> waarvoor men geld inzamelt
 * @author Joe Dalton
 */
public class GoedeDoel {
	private final String naam;
	private BigDecimal opbrengst = BigDecimal.ZERO;

	/**
	 * Maakt een GoedDoel object
	 * @param naam De naam van het goede doel
	 */
	public GoedeDoel(String naam) {
		this.naam = naam;
	}

	/**
	 * Geeft de naam van het goede doel terug
	 * @return de naam
	 */
	public String getNaam() {
		return naam;
	}

	/**
	 * Geeft de opbrengst terug
	 * @return de opbrengst
	 */
	public BigDecimal getOpbrengst() {
		return opbrengst;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof GoedeDoel goedeDoel)) return false;
        return naam.equals(goedeDoel.naam);
	}

	@Override
	public int hashCode() {
		return naam.hashCode();
	}
}
