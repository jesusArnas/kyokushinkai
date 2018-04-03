defmodule KataSpec do
  use ESpec

    describe "#hello()" do
      it "should return world as atom" do
        expect(Kata.hello()).to eq(:world)
      end
    end

end