import SearchForm from "@/components/SearchForm";

export default function Home() {
  return (
    <main className="flex min-h-screen flex-col items-center justify-center bg-gray-100 p-4">
      <h1 className="text-3xl font-bold mb-6">Flight Aggregator</h1>
      <SearchForm />
    </main>
  );
}
