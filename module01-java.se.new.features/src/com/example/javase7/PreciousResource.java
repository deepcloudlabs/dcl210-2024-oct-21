package com.example.javase7;

import java.io.IOException;

public class PreciousResource implements AutoCloseable {
	private final int id;

	public PreciousResource(int id) {
		this.id = id;
	}

	@Override
	public void close() throws IOException {
		System.out.println("Closing the resource [%d]".formatted(id));
		throw new IOException("[%d] Something wrong!".formatted(id));
	}

}
